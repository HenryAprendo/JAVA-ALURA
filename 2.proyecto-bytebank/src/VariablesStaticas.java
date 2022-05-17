
public class VariablesStaticas {
	public static void main(String[] args) {
		Cuenta cuentaUno = new Cuenta(11);
		Cuenta cuentaDos = new Cuenta(11);
		Cuenta cuentaTres = new Cuenta(11);
		Cuenta cuentaCuatro = new Cuenta(11);
		
		System.out.println("La cantidad de cuentas instanciadas es: " + Cuenta.getTotal());
		
		//Las variables estaticas no pueden ser accedidas por las instancias, sino solo a nivel de la 
		//clase y por métodos estaticos. Por medio de ellas por ejemplo podemos obtener la cantidad de veces que se ha instanciado la 
		//la clase.
	}
}
