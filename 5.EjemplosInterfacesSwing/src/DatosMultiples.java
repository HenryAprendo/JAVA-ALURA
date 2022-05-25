import javax.swing.*;

public class DatosMultiples extends JFrame {
	private JTextField textfield;
	private JTextArea textarea;
	private JScrollPane scrollpane;
	
	public DatosMultiples() {
		setLayout(null);
		
		textfield = new JTextField();
		textfield.setBounds(10,10,300,30);
		add(textfield);
		
		textarea = new JTextArea();
		scrollpane = new JScrollPane(textarea);
		scrollpane.setBounds(10,50,300,200);
		add(scrollpane);
	}
	
	public static void main(String[] args) {
		DatosMultiples multiple = new DatosMultiples();
		multiple.setBounds(0,0,400,300);
		multiple.setVisible(true);
		multiple.setLocationRelativeTo(null);
	}
	
}
