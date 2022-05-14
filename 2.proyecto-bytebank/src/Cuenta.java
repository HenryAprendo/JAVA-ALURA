
public class Cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void depositar(double valor) {		//void indica que el método no retorna nada sino solo ejecuta algo
		saldo = saldo + valor;
	}
}
