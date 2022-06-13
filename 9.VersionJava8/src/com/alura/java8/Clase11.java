package com.alura.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Clase11 {
	public static void main(String[] args) {
		
		LocalDate fechaActual = LocalDate.now().minusMonths(0).plusDays(0);
		System.out.println(fechaActual);
		
		
		LocalDate fechaMundialFutbol = LocalDate.of(2022, 11, 12);
		System.out.println(fechaMundialFutbol);
		
		System.out.println(fechaMundialFutbol.getYear() - fechaActual.getYear());
		
		System.out.println(ChronoUnit.DAYS.between(fechaActual, fechaMundialFutbol));
		
		System.out.println(ChronoUnit.MONTHS.between(fechaActual, fechaMundialFutbol));
	}
}
