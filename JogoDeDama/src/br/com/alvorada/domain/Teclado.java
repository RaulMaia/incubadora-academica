package br.com.alvorada.domain;

import java.util.Scanner;

public class Teclado {

	public static String capturarString(String enunciado) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String entradaDigitada = null;

		boolean coordenadaDigitadaValida = false;

		do {
			System.out.println(enunciado);
			entradaDigitada = sc.next();

			// Validar entrada
			String coluna = entradaDigitada.substring(0, 1);
			int linha = Integer.parseInt(entradaDigitada.substring(1, 2));

			boolean testeColuna = (coluna.equalsIgnoreCase("a"))
					|| (coluna.equalsIgnoreCase("b"))
					|| (coluna.equalsIgnoreCase("c"))
					|| (coluna.equalsIgnoreCase("d"))
					|| (coluna.equalsIgnoreCase("e"))
					|| (coluna.equalsIgnoreCase("f"))
					|| (coluna.equalsIgnoreCase("g"))
					|| (coluna.equalsIgnoreCase("h"));
			boolean testeLinha = (linha < 9) && (linha >= 0);
			
			if (testeColuna && testeLinha) {
				coordenadaDigitadaValida = true;
			} else {
				System.out.println("Coordenada digitada incorreta, tente novamente.");
			}

		} while (!coordenadaDigitadaValida);

		//sc.close();
		return entradaDigitada;
	}

}
