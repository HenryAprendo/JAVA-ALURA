import javax.swing.*;
import java.awt.event.*;

public class FinalizarEjecucion extends JFrame implements ActionListener {

	private JButton boton;
	
	public FinalizarEjecucion() {
		setLayout(null);
		boton = new JButton("Finalizar");
		boton.setBounds(300,250,100,30);
		add(boton);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		FinalizarEjecucion finaliza = new FinalizarEjecucion();
		finaliza.setBounds(0,0,450,350);
		finaliza.setVisible(true);
		finaliza.setResizable(false);
	}
	
}
