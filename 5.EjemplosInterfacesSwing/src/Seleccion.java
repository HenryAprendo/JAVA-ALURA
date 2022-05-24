import javax.swing.*;
import java.awt.event.*;

public class Seleccion extends JFrame implements ActionListener {

	private JButton boton1, boton2;
	
	public Seleccion() {
		setLayout(null);
		
		boton1 = new JButton("Mujer");
		boton1.setBounds(20,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("Hombre");
		boton2.setBounds(160,100,100,30);
		add(boton2);
		boton2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			setTitle("Soy una Mujer");
		}
		else {
			setTitle("Soy un Hombre");
		}
	}
	
	public static void main(String[] args) {
		Seleccion seleccion = new Seleccion();
		seleccion.setBounds(0,0,300,200);
		seleccion.setVisible(true);
		seleccion.setResizable(false);
	}
	
}












