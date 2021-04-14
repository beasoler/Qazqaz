/* Busca la primera letra que aparece m�s de una vez*/

package com.dam1d.depu1;

public class Principal {
	public static void main(String[] args) {
		testea("Mississippi"); // soluci�n esperada: i (no s ni p)
		testea("test"); // soluci�n esperada: t
		testea("Pan"); // soluci�n esperada: 0 (no hay letras repetidas)
		
	}

	public static void testea(String s) {
		ClaseTester2 tester = new ClaseTester2(s);
		char resultado = tester.primerCaracterMultiple();
		if (resultado == 0)
			System.out.println("En " + s + " no hay caracteres repetidos");
		else
			System.out.println("En " + s
					+ " el primer caracter que se repite es " + resultado);
	}
}