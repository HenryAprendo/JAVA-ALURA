
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Henry");
		funcionario.setDocumento("72653895");
		funcionario.setSalario(3000);
		
		System.out.println(funcionario.getSalario());
		
		System.out.println(funcionario.getBonificacion());
	}
}
