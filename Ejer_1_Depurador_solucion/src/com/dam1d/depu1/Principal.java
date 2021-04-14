/* Busca la primera letra que aparece más de una vez*/

package com.dam1d.depu1;

public class Principal {
	public static void main(String[] args) {
		testea("Mississippi"); // solución esperada: i (no s ni p)
		testea("test"); // solución esperada: t
		testea("Pan"); // solución esperada: 0 (no hay letras repetidas)
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