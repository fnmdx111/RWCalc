package me.mad4a.core;

import java.math.BigDecimal;

/**
 * User: chsc4698@gmail.com
 * Date: 13-10-31
 * all rights reserved
 */
public class CalcCore {

	BigDecimal internal;
	BigDecimal memory;
	StringBuffer display;

	enum State {CALCULATED, INPUT}
	State state = State.INPUT;

	public CalcCore() {
		display = new StringBuffer(35);
	}

	public void showInternal() {
		display.delete(0, display.length() - 1);

		if (internal.compareTo(BigDecimal.ZERO) < 0) {
			display.append('-');
		}
		String str = internal.toPlainString()
	}

	public void backspace() {
		if (state == State.INPUT) {
			display.deleteCharAt(0);
		}
	}

	public void CE() {
		display.delete(0, display.length() - 1);
	}

	public void C() {
		CE();
		internal = 0.;
	}

	public void switchPN() {
		if (state == State.CALCULATED) {
			internal = -internal;
		} else if (state == State.INPUT) {
			state = State.CALCULATED;

			internal = Double.valueOf(display.toString());
			showInternal();

			switchPN();
		}
	}


}
