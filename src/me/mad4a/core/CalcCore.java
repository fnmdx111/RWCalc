package me.mad4a.core;

import me.mad4a.util.BigDecimalNewtonSquareRoot;

import java.math.BigDecimal;


public class CalcCore {

	BigDecimal internal;
	BigDecimal memory;
	StringBuilder display;

	enum State {CALCULATED, INPUT}
	State state = State.INPUT;

	enum OperatorBuffer {NONE, NEGATE, SQRT, DIVIDE, MOD, MULTIPLY, RECIPROCAL, SUBTRACT, ADD}
	OperatorBuffer operatorBuffer = OperatorBuffer.NONE;

	BigDecimal operandBuffer;

	public CalcCore() {
		display = new StringBuilder(35);
		internal = new BigDecimal("0.");
		memory = new BigDecimal("0.");

		display.append("0.");
	}

	public void showInternal() {
		display.delete(0, display.length());

		String internalString = internal.toString();
		int shift = internalString.indexOf('-') == -1 ? 0 : 1;
		int len = Math.min(internalString.length(), 34 + shift);
		display.append(internal.toString().substring(0, len));

		if (display.indexOf(".") == -1) {
			display.append(".");
		}
	}

	public String display() {
		return display.toString();
	}

	public void backspace() {
		if (state == State.INPUT) {
			int pointIndex = display.indexOf(".");
			if (decimalMode) {
				if (pointIndex == display.length() - 1) {
					decimalMode = false;
				} else {
					display.deleteCharAt(display.length() - 1);
				}
			} else {
				if (display.length() - 2 == 0) {
					display.setCharAt(0, '0');
				} else {
					display.deleteCharAt(pointIndex - 1);
				}
			}
		}
	}

	public void CE() {
		display.delete(0, display.length());
		display.append("0.");
		decimalMode = false;
	}

	public void C() {
		CE();
		internal = new BigDecimal("0.");
	}

	public void negate() {
		if (state == State.CALCULATED) {
			operatorBuffer = OperatorBuffer.NEGATE;
			internal = internal.negate();

			operandBuffer = new BigDecimal(internal.toString());
		} else if (state == State.INPUT) {
			state = State.CALCULATED;

			internal = new BigDecimal(display.toString());
			negate();
		}
		showInternal();
	}

	public void reciprocal() {
		state = State.CALCULATED;
		operatorBuffer = OperatorBuffer.RECIPROCAL;

		try {
		    internal = BigDecimal.ONE.divide(internal);
		} catch (ArithmeticException ex) {
			System.err.println(ex.getMessage());
			internal = BigDecimal.ZERO;
		}
		operandBuffer = new BigDecimal(internal.toString());

		showInternal();
	}

	public void squareRoot() {
		state = State.CALCULATED;
		operatorBuffer = OperatorBuffer.SQRT;

		internal = BigDecimalNewtonSquareRoot.sqrt(new BigDecimal(display.toString()));
		operandBuffer = new BigDecimal(internal.toString());

		showInternal();
	}

	private void number(int n) {
		if (state == State.CALCULATED) {
			CE();
			state = State.INPUT;
		}

		char ch = (char)(n + (int)'0');
		if (display.length() == 2 && display.charAt(0) == '0') {
			display.setCharAt(0, ch);
		} else {
			if (decimalMode) {
				display.append(ch);
			} else {
				display.deleteCharAt(display.length() - 1);
				display.append(ch);
				display.append('.');
			}
		}
	}

	public boolean decimalMode = false;
	public void point() {
		decimalMode = true;
	}

	private void binaryOperator(OperatorBuffer operatorBuffer) {
		this.operatorBuffer = operatorBuffer;
		operandBuffer = new BigDecimal(display.toString());

		display.delete(0, display.length());
		display.append("0.");
	}

	public void divide() {
		binaryOperator(OperatorBuffer.DIVIDE);
	}

	public void mod() {
		binaryOperator(OperatorBuffer.MOD);
	}

	public void multiply() {
		binaryOperator(OperatorBuffer.MULTIPLY);
	}

	public void subtract() {
		binaryOperator(OperatorBuffer.SUBTRACT);
	}

	public void add() {
		binaryOperator(OperatorBuffer.ADD);
	}

	public void equal() {
		state = State.CALCULATED;

		BigDecimal operand = new BigDecimal(display.toString());
		switch (operatorBuffer) {
			case ADD:
				internal = operandBuffer.add(operand);
				break;
			case SUBTRACT:
				internal = operandBuffer.subtract(operand);
				break;
			case MULTIPLY:
				internal = operandBuffer.multiply(operand);
				break;
			case DIVIDE:
				try {
				    internal = operandBuffer.divide(operand, 35, BigDecimal.ROUND_CEILING);
				} catch (ArithmeticException ex) {
					System.err.println(ex.getMessage());
					internal = BigDecimal.ZERO;
				}
				break;
			case MOD:
				internal = operandBuffer.remainder(operand);
		}

		operandBuffer = new BigDecimal(operand.toString());
		showInternal();
	}

	public void four() {
		number(4);
	}

	public void five() {
		number(5);
	}

	public void six() {
		number(6);
	}

	public void zero() {
		number(0);
	}

	public void one() {
		number(1);
	}

	public void two() {
		number(2);
	}

	public void three() {
		number(3);
	}

	public void seven() {
		number(7);
	}

	public void eight() {
		number(8);
	}

	public void nine() {
		number(9);
	}

	public static void main(String[] args) {
		CalcCore core = new CalcCore();
		core.nine();
		System.out.println(core.display.toString());
		core.nine();
		System.out.println(core.display.toString());
		core.nine();
		System.out.println(core.display.toString());
		core.point();
		System.out.println(core.display.toString());
		core.eight();
		System.out.println(core.display.toString());
		core.eight();
		System.out.println(core.display.toString());
		core.backspace();
		System.out.println(core.display.toString());
		core.backspace();
		System.out.println(core.display.toString());
		core.backspace();
		System.out.println(core.display.toString());
		core.backspace();
		System.out.println(core.display.toString());
		core.backspace();
		System.out.println(core.display.toString());
		core.backspace();
		System.out.println(core.display.toString());
		core.backspace();
		System.out.println(core.display.toString());
		core.eight();
		System.out.println(core.display.toString());
		core.squareRoot();
		System.out.println(core.display.toString());
		core.negate();
		System.out.println(core.display.toString());
		core.add();
		System.out.println(core.display.toString());
		core.six();
		System.out.println(core.display.toString());
		core.equal();
		System.out.println(core.display.toString());
	}
}
