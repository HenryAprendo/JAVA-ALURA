import javax.swing.*;
import java.awt.event.*;

public class Suma extends JFrame implements ActionListener {

	private JTextField textfield1, textfield2;
	private JButton button;
	
	public Suma() {
		setLayout(null);
		
		textfield1 = new JTextField();
		textfield1.setBounds(10,20,200,30);
		add(textfield1);
		
		textfield2 = new JTextField();
		textfield2.setBounds(10,80,200,30);
		add(textfield2);
		
		button = new JButton("Sumar");
		button.setBounds(10,140,200,30);
		add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			int numero1 = Integer.parseInt(textfield1.getText());
			int numero2 = Integer.parseInt(textfield2.getText());
			int suma = numero1 + numero2;
			String total = String.valueOf(suma);
			setTitle(total);
		}
	}
	
	public static void main(String[] args) {
		Suma suma = new Suma();
		suma.setBounds(0,0,250,280);
		suma.setVisible(true);
		suma.setResizable(false);
		suma.setLocationRelativeTo(null);
	}
	
	
	
}

















