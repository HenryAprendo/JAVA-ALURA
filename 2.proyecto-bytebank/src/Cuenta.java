
public class Cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void depositar(double valor) {		//void indica que el m�todo no retorna nada sino solo ejecuta algo
		saldo = saldo + valor;
	}
}
