package com.dam1d.depu1;

public class ClaseTester2 {

	private String palabra;

	public ClaseTester2(String palabraAnalizada) {
		palabra = palabraAnalizada;
	}

	public char primerCaracterMultiple() {
		for (int i = 0; i < palabra.length(); i++) {
			char caracter = palabra.charAt(i);
			if (busca(caracter, i) != -1)
				return caracter;
		}
		return 0;
	}

	private int busca(char caracterBuscado, int posicionParaBuscar) {
		for (int j = posicionParaBuscar+1; j < palabra.length(); j++) {
			char caracterEncontrado = palabra.charAt(j);
			if (caracterEncontrado == caracterBuscado) {
				return j;
			}
		}
		return -1;
	}

}