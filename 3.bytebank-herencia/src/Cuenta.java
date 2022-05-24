
public abstract class Cuenta {

	//Atributos
	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	//Constructor
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		
		Cuenta.total++;
	}

	//Métodos
	public abstract void depositar(double valor);

	public void saca(double valor) { // boolean indica que el metodo debe retornar un valor del tipo booleano
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;				
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			
			this.saca(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	//Acceso a variables private por getter y setter
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//public void setAgencia(int agencia) {
	//if (agencia > 0) {
	//		this.agencia = agencia;
	//	}
	//	else {
	//		System.out.println("No estan permitidos valores negativos");
	//	}
	//}
	//Con el constructor no tiene sentido usar este método.
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Acesso a variables estatica
	public static int getTotal() {
		return Cuenta.total;
	}
	

}



// Los métodos get y set, nos ayudan a proteger nuestras variables o atributos de la clase, 
// tambien a validar el tipo de información que se les quiere asignar y
// evitamos una manipulación directa de estos atributos, obteniendo asi encapsulamiento.
// Todo esto junto con un modificador de acceso private para los atributos que queremos proteger.
















