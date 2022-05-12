
public class ImpuestoRenta {
	public static void main(String[] args) {
		double salario = 1300.0;

		boolean esImpuestoRentaBajo = (salario >= 1900.0 && salario <= 2800.0);
		boolean esImpuestoRentaMedio = (salario >= 2800.01 && salario <= 3751.0);
		boolean esImpuestoRentaAlto = (salario >= 3751.01 && salario <= 4600.0);
		
		

		if (esImpuestoRentaBajo) {
			salario = salario - 142;
			System.out.println("El impuesto de renta es del 7.5% y su salario queda en un total de: " + salario);
		} else if (esImpuestoRentaMedio) {
			salario = salario - 350;
			System.out.println("El impuesto de renta es del 15% y su salario queda en un total de: " + salario);
		} else if (esImpuestoRentaAlto) {
			salario = salario - 636;
			System.out.println("El impuesto de renta es del 22.5% y su salario queda en un total de: " + salario);
		} else {
			System.out.println("Usted esta exento del impuesto de renta, su salario queda en un total de: " + salario);

		}
	}
}
