import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CombinarColor extends JFrame implements ActionListener {

	private JLabel label1, label2, label3;
	private JComboBox combo1, combo2, combo3;
	private JButton button;
	
	public CombinarColor() {
		setLayout(null);
		
		//Rojo
		label1 = new JLabel("Rojo:");
		label1.setBounds(10,10,70,20);
		add(label1);
		combo1 = new JComboBox();
		combo1.setBounds(120,10,70,30);
		add(combo1);
		for (int i = 0; i <= 255; i++ ) {
			combo1.addItem(String.valueOf(i));
		}
		
		//Verde
		label2 = new JLabel("Verde:");
		label2.setBounds(10,50,70,20);
		add(label2);
		combo2 = new JComboBox();
		combo2.setBounds(120,50,70,30);
		add(combo2);
		for (int i = 0; i <= 255; i++ ) {
			combo2.addItem(String.valueOf(i));
		}
		
		//Azul
		label2 = new JLabel("Azul:");
		label2.setBounds(10,90,70,20);
		add(label2);	
		combo3 = new JComboBox();
		combo3.setBounds(120,90,70,30);
		add(combo3);
		for (int i = 0; i <= 255; i++ ) {
			combo3.addItem(String.valueOf(i));
		}
		
		//Button
		button = new JButton("Fijar color");
		button.setBounds(10,180,100,30);
		add(button);
		button.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String cad1 = (String)combo1.getSelectedItem();
			String cad2 = (String)combo2.getSelectedItem();
			String cad3 = (String)combo3.getSelectedItem();
			
			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);
			
			Color color2 = new Color(rojo,verde,azul);
			button.setBackground(color2);
		}
	}
	
	public static void main(String[] args) {
		CombinarColor fondo = new CombinarColor();
		fondo.setBounds(0,0,300,300);
		fondo.setVisible(true);
		fondo.setLocationRelativeTo(null);
		
	}
	
}







