package me.mad4a.ui;

import me.mad4a.core.CalcCore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class RWCButtonPanel extends Composite {

	public RWCButtonPanel(Composite parent, int style) {
		super(parent, style);

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 5;
		gridLayout.horizontalSpacing = 5;
		gridLayout.makeColumnsEqualWidth = true;

		setLayout(gridLayout);

		createButtons();
	}

	public Button btnBackspace;
	public Button btnCE;
	public Button btnC;
	public Button btnNegate;
	public Button btnSquareRoot;
	public Button btnSeven;
	public Button btnEight;
	public Button btnNine;
	public Button btnDivide;
	public Button btnMod;
	public Button btnFour;
	public Button btnFive;
	public Button btnSix;
	public Button btnMultiply;
	public Button btnReciprocal;
	public Button btnOne;
	public Button btnTwo;
	public Button btnThree;
	public Button btnSubtract;
	public Button btnEqual;
	public Button btnZero;
	public Button btnPoint;
	public Button btnAdd;


	public void createButtons() {
		GridData gridData;

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnBackspace = new Button(this, SWT.PUSH);
		btnBackspace.setText("->");
		btnBackspace.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnCE = new Button(this, SWT.PUSH);
		btnCE.setText("CE");
		btnCE.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnC = new Button(this, SWT.PUSH);
		btnC.setText("C");
		btnC.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnNegate = new Button(this, SWT.PUSH);
		btnNegate.setText("+/-");
		btnNegate.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnSquareRoot = new Button(this, SWT.PUSH);
		btnSquareRoot.setText("sqrt");
		btnSquareRoot.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnSeven = new Button(this, SWT.PUSH);
		btnSeven.setText("7");
		btnSeven.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnEight = new Button(this, SWT.PUSH);
		btnEight.setText("8");
		btnEight.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnNine = new Button(this, SWT.PUSH);
		btnNine.setText("9");
		btnNine.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnDivide = new Button(this, SWT.PUSH);
		btnDivide.setText("/");
		btnDivide.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnMod = new Button(this, SWT.PUSH);
		btnMod.setText("Mod");
		btnMod.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnFour = new Button(this, SWT.PUSH);
		btnFour.setText("4");
		btnFour.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnFive = new Button(this, SWT.PUSH);
		btnFive.setText("5");
		btnFive.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnSix = new Button(this, SWT.PUSH);
		btnSix.setText("6");
		btnSix.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnMultiply = new Button(this, SWT.PUSH);
		btnMultiply.setText("*");
		btnMultiply.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnReciprocal = new Button(this, SWT.PUSH);
		btnReciprocal.setText("1/x");
		btnReciprocal.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnOne = new Button(this, SWT.PUSH);
		btnOne.setText("1");
		btnOne.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnTwo = new Button(this, SWT.PUSH);
		btnTwo.setText("2");
		btnTwo.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnThree = new Button(this, SWT.PUSH);
		btnThree.setText("3");
		btnThree.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnSubtract = new Button(this, SWT.PUSH);
		btnSubtract.setText("-");
		btnSubtract.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 2;
		btnEqual = new Button(this, SWT.PUSH);
		btnEqual.setText("=");
		btnEqual.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 2;
		gridData.verticalSpan = 1;
		btnZero = new Button(this, SWT.PUSH);
		btnZero.setText("0");
		btnZero.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnPoint = new Button(this, SWT.PUSH);
		btnPoint.setText(".");
		btnPoint.setLayoutData(gridData);

		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		btnAdd = new Button(this, SWT.PUSH);
		btnAdd.setText("+");
		btnAdd.setLayoutData(gridData);
	}

	public void bindButtons(final CalcCore core) {
		btnBackspace.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.backspace();
			}
		});
		btnCE.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.CE();
			}
		});
		btnC.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.C();
			}
		});
		btnNegate.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.negate();
			}
		});
		btnSquareRoot.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.squareRoot();
			}
		});
		btnSeven.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.seven();
			}
		});
		btnEight.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.eight();
			}
		});
		btnNine.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.nine();
			}
		});
		btnDivide.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.divide();
			}
		});
		btnMod.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.mod();
			}
		});
		btnFour.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.four();
			}
		});
		btnFive.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.five();
			}
		});
		btnSix.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.six();
			}
		});
		btnMultiply.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.multiply();
			}
		});
		btnReciprocal.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.reciprocal();
			}
		});
		btnOne.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.one();
			}
		});
		btnTwo.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.two();
			}
		});
		btnThree.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.three();
			}
		});
		btnSubtract.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.subtract();
			}
		});
		btnEqual.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.equal();
			}
		});
		btnZero.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.zero();
			}
		});
		btnPoint.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.point();
			}
		});
		btnAdd.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				core.add();
			}
		});
	}
	public Button[] getButtons() {
		return new Button[] {btnBackspace, btnCE, btnC, btnNegate, btnSquareRoot,
				btnSeven, btnEight, btnNine, btnDivide, btnMod,
				btnFour, btnFive, btnSix, btnMultiply, btnReciprocal,
				btnOne, btnTwo, btnThree, btnSubtract, btnEqual,
				btnZero, btnPoint, btnAdd};
	}
}
