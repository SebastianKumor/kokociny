package nesermaus;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Projektant extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Projektant(Composite parent, int style) {
		super(parent, style);
		
		Label lblProjektant = new Label(this, SWT.NONE);
		lblProjektant.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblProjektant.setBounds(179, 10, 86, 32);
		lblProjektant.setText("Projektant");
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(85, 110, 92, 81);
		btnNewButton.setText("Projektujem");
		
		Button btnNewButton_1 = new Button(this, SWT.NONE);
		btnNewButton_1.setBounds(262, 110, 92, 81);
		btnNewButton_1.setText("Projekt Hotovy");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
