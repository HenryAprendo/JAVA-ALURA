
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	//Aplicando polimorfismo bajo su propia l�gica de negocio, mediante la re-escritura de un m�todo y 
	//modicando su implementaci�n.
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}
	
	public void depositar(double valor) {
		this.saldo += valor; 
	}
	
}
