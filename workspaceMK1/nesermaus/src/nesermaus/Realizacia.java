package nesermaus;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public class Realizacia extends Composite {
	private Text text;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Realizacia(Composite parent, int style) {
		super(parent, style);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(177, 10, 96, 35);
		lblNewLabel.setText("Realizacia");
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(289, 98, 129, 82);
		btnNewButton.setText("Projekt Zrealizovany");
		
		Label lblProjektHotovyNa = new Label(this, SWT.NONE);
		lblProjektHotovyNa.setBounds(34, 100, 115, 15);
		lblProjektHotovyNa.setText("Projekt hotovy na %:");
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(59, 121, 76, 47);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
