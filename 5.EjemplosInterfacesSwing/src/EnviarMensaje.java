import javax.swing.*;
import java.awt.event.*;

public class EnviarMensaje extends JFrame implements ActionListener {
	private JScrollPane scrollpane;
	private JTextArea textarea;
	private JButton button;
	
	public EnviarMensaje() {
		setLayout(null);
		
		textarea = new JTextArea();
		scrollpane = new JScrollPane(textarea);
		scrollpane.setBounds(10,10,300,200);
		add(scrollpane);
		
		button = new JButton("Verificar");
		button.setBounds(10,260,100,30);
		add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String texto = textarea.getText();
			if (texto.indexOf("argentina") != -1) {
				setTitle("Si contiene el texto \"argentina\" " );
			}
			else {
				setTitle("No contiene el texto \"argentina\" " );
			}
		}
	}
	
	
	public static void main(String[] args) {
		EnviarMensaje mensaje = new EnviarMensaje();
		mensaje.setBounds(0,0,400,380);
		mensaje.setVisible(true);
		mensaje.setLocationRelativeTo(null);
	}
	
}














