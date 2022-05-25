import javax.swing.*;
import java.awt.event.*;

public class Usuario extends JFrame implements ActionListener{

	private JTextField textField;
	private JButton boton;	
	private JLabel label;
	
	public Usuario() {
		setLayout(null);
		
		boton = new JButton("Aceptar");
		boton.setBounds(10, 120, 100, 30);
		add(boton);
		boton.addActionListener(this);
		
		label = new JLabel("Usuario:");
		label.setBounds(10,10,100,30);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(150,10,200,20);
		add(textField);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			String titulo = textField.getText();
			setTitle(titulo);
 		}
	}
	
	
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setBounds(0,0,400,200);
		usuario.setVisible(true);
		usuario.setResizable(false);
		usuario.setLocationRelativeTo(null);		
	}
	
	
}













