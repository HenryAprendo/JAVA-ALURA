
public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	
	//M�todo constructor
	public Funcionario() {
		
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario += salario;
	}
	
	//M�todo abstracto, un m�todo abstracto define solo la firma (visibilidad, retorno, nombre del m�todo y par�metros
	public abstract double getBonificacion();
	
}


















