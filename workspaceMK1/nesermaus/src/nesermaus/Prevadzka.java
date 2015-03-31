package nesermaus;

import org.eclipse.swt.widgets.Composite;

public class Prevadzka extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Prevadzka(Composite parent, int style) {
		super(parent, style);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
