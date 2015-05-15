package br.com.alvorada.domain;

public class Tabuleiro {
	
	public static void desenharTabuleiro (String tabuleiro[][])  {
		System.out.println("|  A |  B |  C |  D |  E |  F |  G |  H ||");
		System.out.println("|____|____|____|____|____|____|____|____||_______");
		for (int i=0; i<8; i++) {
						for (int j=0; j<8; j++){
				System.out.print("------");
			}
			System.out.println();
			
			for (int j=0; j<8; j++){
				System.out.print("|" + tabuleiro[i][j]);
			}
			System.out.println("||  "+(i+1));
		}
		System.out.println("-------------------------------------------------");

	}

}
