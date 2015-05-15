package br.com.alvorada.domain;

public class JogoDeDama {

	public static void main(String[] args) {
		
		String[][] dadosTabuleiro = {{"    "," PB ","    "," PB ","    "," PB ","    "," PB "},
									 {" PB ","    "," PB ","    "," PB ","    "," PB ","    "},
									 {"    "," PB ","    "," PB ","    "," PB ","    "," PB "},
									 {"    ","    ","    ","    ","    ","    ","    ","    "},
									 {"    ","    ","    ","    ","    ","    ","    ","    "},
									 {" PP ","    "," PP ","    "," PP ","    "," PP ","    "},
									 {"    "," PP ","    "," PP ","    "," PP ","    "," PP "},
									 {" PP ","    "," PP ","    "," PP ","    "," PP ","    "}
		};
		
		
			
		
		
		Tabuleiro.desenharTabuleiro(dadosTabuleiro);
		
		String coordenadaOrigem = Teclado.capturarString("Qual peça deseja mover?\n(Exemplo: D5): ");
		System.out.println(coordenadaOrigem);
		String coordenadaDestino = Teclado.capturarString("Mover para onde?\n(Exemplo: D5)");
		System.out.println(coordenadaDestino);
		int coordenadaColunaPeca;
		int coordenadaLinhaPeca;
		int coordenadaColunaAlvo;
		int coordenadaLinhaAlvo;

	} 

}
