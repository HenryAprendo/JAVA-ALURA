import javax.swing.*;
import java.awt.event.*;
public class VentanaUno extends JFrame implements ActionListener {
	private JButton boton1;
	
	public VentanaUno() {
		setLayout(null);
		setTitle("Menu");
		boton1 = new JButton("ir ventana2");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			VentanaDos v2 = new VentanaDos();
			v2.setBounds(0,0,300,300);
			v2.setVisible(true);
			v2.setLocationRelativeTo(null);
			
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		VentanaUno ventana = new VentanaUno();
		ventana.setBounds(0,0,300,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
}
