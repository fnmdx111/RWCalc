package me.mad4a.ui;

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

	private Button btnBackspace;
	private Button btnCE;
	private Button btnC;
	private Button btnSwitchPN;
	private Button btnSquareRoot;
	private Button btnSeven;
	private Button btnEight;
	private Button btnNine;
	private Button btnDivide;
	private Button btnMod;
	private Button btnFour;
	private Button btnFive;
	private Button btnSix;
	private Button btnMultiply;
	private Button btnReciprocal;
	private Button btnOne;
	private Button btnTwo;
	private Button btnThree;
	private Button btnMinus;
	private Button btnEqual;
	private Button btnZero;
	private Button btnPoint;
	private Button btnAdd;


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
		btnSwitchPN = new Button(this, SWT.PUSH);
		btnSwitchPN.setText("+/-");
		btnSwitchPN.setLayoutData(gridData);

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
		btnMinus = new Button(this, SWT.PUSH);
		btnMinus.setText("-");
		btnMinus.setLayoutData(gridData);

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
}

