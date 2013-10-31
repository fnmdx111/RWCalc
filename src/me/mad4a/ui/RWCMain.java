package me.mad4a.ui;

import me.mad4a.core.CalcCore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


public class RWCMain extends Composite {

	Label result;
	RWCButtonPanel buttonPanel;
	CalcCore core;

	public RWCMain(Composite parent, int style) {
		super(parent, style);

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.makeColumnsEqualWidth = true;
		layout.horizontalSpacing = 5;
		setLayout(layout);

		GridData gridData;

		gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 1;
		result = new Label(this, SWT.BORDER | SWT.SHADOW_IN | SWT.RIGHT);
		result.setBackground(getDisplay().getSystemColor(SWT.COLOR_WHITE));
		result.setLayoutData(gridData);

		buttonPanel = new RWCButtonPanel(this, SWT.NONE);
		gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 1;
		gridData.verticalSpan = 5;
		buttonPanel.setLayoutData(gridData);
	}

	public void setResultText(String s) {
		result.setText(s);
	}

	public void setResultText(int i) {
		result.setText(String.valueOf(i));
	}

	public void setResultText(double d) {
		result.setText(String.valueOf(d));
	}

	public void setCore(CalcCore core) {
		this.core = core;
	}
}
