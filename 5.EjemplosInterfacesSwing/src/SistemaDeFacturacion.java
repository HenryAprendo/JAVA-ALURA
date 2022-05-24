import javax.swing.*;

public class SistemaDeFacturacion extends JFrame{

	//Declarations
	private JLabel label1;
	private JLabel label2;
	
	//Constructor
	public SistemaDeFacturacion() {
		setLayout(null);
		label1 = new JLabel("Sistema de Facturación");
		label1.setBounds(20,20,150,50);
		add(label1);
		
		label2 = new JLabel("Versión 1.0");
		label2.setBounds(20,100,100,50);
		add(label2);		
	}
	
	
	//Implementación
	public static void main(String[] args) {
		SistemaDeFacturacion sistema = new SistemaDeFacturacion();
		sistema.setBounds(0,0,300,250);
		sistema.setVisible(true);
		sistema.setResizable(false);
	}
	
}










