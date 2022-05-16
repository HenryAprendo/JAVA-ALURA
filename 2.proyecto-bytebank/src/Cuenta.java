
public class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;

	public void depositar(double valor) { // void indica que el método no retorna nada sino solo ejecuta algo
		this.saldo += valor;
	}

	public boolean retirar(double valor) { // boolean indica que el metodo debe retornar un valor del tipo booleano
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	//Acceso a variables private por getter y setter
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
		else {
			System.out.println("No estan permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
}



// Los métodos get y set, nos ayudan a proteger nuestras variables o atributos de la clase, 
// tambien a validar el tipo de información que se les quiere asignar y
// evitamos una manipulación directa de estos atributos, obteniendo asi encapsulamiento.
// Todo esto junto con un modificador de acceso private para los atributos que queremos proteger.
















