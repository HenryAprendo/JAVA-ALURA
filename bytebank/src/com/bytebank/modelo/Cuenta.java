package com.bytebank.modelo;

/**
 * Cuenta crea instancias de CuentaAhorro y CuentaCorriente 
 * 
 * @version 1.0.0
 * @author Henry
 *
 */
public abstract class Cuenta {

	//Atributos
	public double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	/***
	 * Instancia una nueva cuenta sin parametros
	 */
	public Cuenta() {
		
	}
	
	/**
	 * Instancia una nueva cuenta usando agencia y numero
	 * @param agencia
	 * @param numero
	 */
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		
		Cuenta.total++;
	}

	//Métodos
	public abstract void depositar(double valor);

	/**
	 * Éste método retira dinero de una cuenta y si ocurre un error lanza una excepción
	 * @param valor
	 */
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
	
	public int getNumero() {
		return this.numero;
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
	
	@Override
	public String toString() {
		
		String cuenta = "Número: " + this.numero + ", agencia: " + this.agencia + ", titular: " + this.titular.getNombre();
		return cuenta;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta) obj;
		return cuenta.numero == this.getNumero() && 
			   cuenta.agencia == this.getAgencia();	
	}

}



// Los métodos get y set, nos ayudan a proteger nuestras variables o atributos de la clase, 
// tambien a validar el tipo de información que se les quiere asignar y
// evitamos una manipulación directa de estos atributos, obteniendo asi encapsulamiento.
// Todo esto junto con un modificador de acceso private para los atributos que queremos proteger.
















