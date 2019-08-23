package lectorarchivos.vista;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.UIManager;

public class PanelOpciones extends JPanel {
	private JCheckBox chckbxEspacioAGuin;
	private JCheckBox chckbxMaysculaAMinscula;
	private JCheckBox chckbxParentesisACorchete;

	/**
	 * Create the panel.
	 */
	public PanelOpciones() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Opciones de filtro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(2, 2, 0, 0));
		
		chckbxEspacioAGuin = new JCheckBox("Espacio a gui\u00F3n bajo");
		add(chckbxEspacioAGuin);
		
		chckbxMaysculaAMinscula = new JCheckBox("May\u00FAscula a min\u00FAscula");
		add(chckbxMaysculaAMinscula);
		
		chckbxParentesisACorchete = new JCheckBox("Paréntesis a corchete");
		add(chckbxParentesisACorchete);

	}
	
	public boolean filtroEspacioAGuionActivado() {
		return chckbxEspacioAGuin.isSelected();
	}
	
	public boolean filtroMayusculaAMinuscalaActivado() {
		return chckbxMaysculaAMinscula.isSelected();
	}
	
	public boolean filtroParentesisACorcheteActivado() {
		return chckbxParentesisACorchete.isSelected();
	}
}
