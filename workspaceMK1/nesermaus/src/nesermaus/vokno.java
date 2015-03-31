package nesermaus;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.ProgressBar;

public class vokno extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public vokno(Composite parent, int style) {
		super(parent, style);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(32, 182, 102, 82);
		btnNewButton.setText("Projektant");
		
		Button btnOverenie = new Button(this, SWT.NONE);
		btnOverenie.setBounds(140, 182, 102, 82);
		btnOverenie.setText("Overenie");
		
		Button btnRealizacia = new Button(this, SWT.NONE);
		btnRealizacia.setBounds(248, 182, 87, 82);
		btnRealizacia.setText("Realizacia");
		
		Button btnZavedenieDoPrevadzky = new Button(this, SWT.NONE);
		btnZavedenieDoPrevadzky.setBounds(341, 182, 185, 82);
		btnZavedenieDoPrevadzky.setText("Zavedenie do  prevadzky");
		
		Label lblZadajteSvojePracovnu = new Label(this, SWT.NONE);
		lblZadajteSvojePracovnu.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.ITALIC));
		lblZadajteSvojePracovnu.setBounds(32, 47, 273, 44);
		lblZadajteSvojePracovnu.setText("Zadajte svoje pracovnu poziciu");		
		
		Label lblAktualnyStav = new Label(this, SWT.NONE);
		lblAktualnyStav.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.ITALIC));
		lblAktualnyStav.setBounds(32, 293, 111, 30);
		lblAktualnyStav.setText("Aktualny Stav");
		
		ProgressBar progressBar = new ProgressBar(this, SWT.NONE);
		progressBar.setBounds(32, 356, 170, 17);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
