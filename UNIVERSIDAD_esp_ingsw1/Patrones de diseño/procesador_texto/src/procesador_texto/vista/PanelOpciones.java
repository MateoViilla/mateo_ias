package procesador_texto.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import procesador_texto.modelo.EnumFuentes;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelOpciones extends JPanel {
	
	private JTextField txtTamaño;
	private ProcesadorTextoFrame frame;
	private JComboBox<EnumFuentes> cbFuente;
	private JButton btnColor;
	
	public PanelOpciones(ProcesadorTextoFrame frame) {
		this();
		this.frame = frame;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelOpciones() {
		setBorder(new LineBorder(Color.GRAY));
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		JLabel lblFuente = new JLabel("Fuente:");
		add(lblFuente);
		
		cbFuente = new JComboBox<EnumFuentes>();
		cbFuente.setModel(new DefaultComboBoxModel<EnumFuentes>(EnumFuentes.values()));
		add(cbFuente);
		
		JLabel lblColor = new JLabel("Color:");
		add(lblColor);
		
		btnColor = new JButton("");
		btnColor.setBackground(Color.BLACK);
		btnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(frame, "Seleccionar color de letra", Color.BLACK);
				btnColor.setBackground(color);
			}
		});
		btnColor.setPreferredSize(new Dimension(33, 33));
		add(btnColor);
		
		JLabel lblTamao = new JLabel("Tamaño:");
		add(lblTamao);
		
		txtTamaño = new JTextField();
		txtTamaño.setText("10");
		add(txtTamaño);
		txtTamaño.setColumns(10);

	}
	
	public EnumFuentes getFuente() {
		return  cbFuente.getItemAt(cbFuente.getSelectedIndex());
	}

	public Color getColor() {
		return btnColor.getBackground();
	}
	
	public int getTamaño() {
		return Integer.parseInt(txtTamaño.getText());
	}
}
