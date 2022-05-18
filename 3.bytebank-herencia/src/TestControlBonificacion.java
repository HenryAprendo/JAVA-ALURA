
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(3000);
		
		Gerente gerente = new Gerente();
		gerente.setSalario(9000);
		
		Contador contador = new Contador();
		contador.setSalario(5000);
		
		ControlBonificacion bonificacion = new ControlBonificacion();
		
		System.out.println(bonificacion.registrarSalario(funcionario));
		System.out.println(bonificacion.registrarSalario(gerente));
		System.out.println(bonificacion.registrarSalario(contador));
		
		//Aun cuando en este momento la clase ControlBonificacion solo tiene un m�todo para el tipo Funcionario, con esto es suficiente
		//pues Contador y Gerente extienden de Funcionario, esta es la puerta de entrada. 
		//Java detecta el tipo de argumento con que se esta ejecutando el m�todo registrarSalario y con base en esto determina el m�todo correspondiente
		//al tipo, para Gerente el de la clase Gerente, y para Funcionario el de la clase funcionario porque el llama al mas especifico
		//es decir al de la propia clase.
		//Como Contador no lo tiene definido hereda el de la clase Funcionario, a menos que se defina y se reescriba el m�todo getBonificaci�n.
		
		//ESTO ES UNA FORMA DE IMPLEMENTAR POLIMORFISMO
		
	}
}
