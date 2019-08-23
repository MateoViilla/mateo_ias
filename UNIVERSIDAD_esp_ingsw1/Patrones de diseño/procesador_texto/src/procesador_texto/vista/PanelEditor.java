package procesador_texto.vista;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import procesador_texto.modelo.Caracter;

public class PanelEditor extends JPanel {
	private ProcesadorTextoFrame frame;
	
	private JTextPane tpEditor;
	
	SimpleAttributeSet aSet;
	
	public PanelEditor(ProcesadorTextoFrame frame) {
		this();
		this.frame = frame;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelEditor() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		tpEditor = new JTextPane();
		tpEditor.setEditable(false);
		scrollPane.setViewportView(tpEditor);
		
		tpEditor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				frame.agregarCaracterADocumento(c);
			}
		});
		
		 aSet = new SimpleAttributeSet();
	}

	public void refrescarEditor(Caracter caracter) {
		StyleConstants.setFontFamily(aSet, caracter.getFuente());
		StyleConstants.setFontSize(aSet, caracter.getTamaño());
		StyleConstants.setForeground(aSet, caracter.getColor());
		
		StyledDocument doc = tpEditor.getStyledDocument();
		try {
			doc.insertString(doc.getLength(), Character.toString(caracter.getRepresentacion()), aSet);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}
