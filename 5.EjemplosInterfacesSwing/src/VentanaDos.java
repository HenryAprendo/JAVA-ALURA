import javax.swing.*;
import java.awt.event.*;
public class VentanaDos extends JFrame implements ActionListener {
	private JButton boton2;
	
	public VentanaDos() {
		setLayout(null);
		setTitle("Entrada");
		boton2 = new JButton("ir ventana1");
		boton2.setBounds(10,100,100,30);
		add(boton2);
		boton2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton2) {
			VentanaUno v1 = new VentanaUno();
			v1.setBounds(0,0,300,300);
			v1.setVisible(true);
			v1.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		VentanaDos ventana = new VentanaDos();
		ventana.setBounds(0,0,300,300);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
}
