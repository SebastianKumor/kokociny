package nesermaus;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class Overenie extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Overenie(Composite parent, int style) {
		super(parent, style);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblNewLabel.setBounds(176, 37, 97, 30);
		lblNewLabel.setText("Overenie");
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(56, 110, 120, 74);
		btnNewButton.setText("Projekt je v poriadku");
		
		Button btnProjektJeV = new Button(this, SWT.NONE);
		btnProjektJeV.setText("Projekt je zly");
		btnProjektJeV.setBounds(303, 110, 90, 74);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
