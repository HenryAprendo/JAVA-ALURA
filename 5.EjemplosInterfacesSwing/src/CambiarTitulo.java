import javax.swing.*;
import java.awt.event.*;

public class CambiarTitulo extends JFrame implements ActionListener{
	
	private JButton boton1, boton2, boton3;
	
	public CambiarTitulo() {
		setLayout(null);
		
		boton1 = new JButton("1");
		boton1.setBounds(10, 100, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("2");
		boton2.setBounds(120, 100, 100, 30);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("3");
		boton3.setBounds(230, 100, 100, 30);
		add(boton3);
		boton3.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {		
		if (e.getSource() == boton1) {
			setTitle("First Button");
		}
		else if (e.getSource() == boton2) {
			setTitle("Second Button");
		}
		else {
			setTitle("Third Button");
		}
	}
	
	public static void main(String[] args) {
		CambiarTitulo ct = new CambiarTitulo();
		ct.setBounds(0,0,400,200);
		ct.setVisible(true);
		ct.setResizable(false);
	}
	
	
}















