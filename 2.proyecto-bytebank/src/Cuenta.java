
public class Cuenta {

	double saldo;
	int agencia;
	int numero;
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
}
