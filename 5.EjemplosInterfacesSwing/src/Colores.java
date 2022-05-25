import javax.swing.*;
import java.awt.event.*;

public class Colores extends JFrame implements ItemListener {
	private JComboBox combo;
	
	public Colores() {
		setLayout(null);
		
		combo = new JComboBox();
		combo.setBounds(10,10,100,30);
		add(combo);
		combo.addItem("azul");
		combo.addItem("rojo");
		combo.addItem("amarillo");
		combo.addItem("verde");
		combo.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo) {
			String seleccionado = (String)combo.getSelectedItem();
			setTitle(seleccionado);
		}
		
	}
	
	
	public static void main(String[] args) {
		Colores color1 = new Colores();
		color1.setBounds(0,0,300,150);
		color1.setVisible(true);
		color1.setLocationRelativeTo(null);
	}

}



