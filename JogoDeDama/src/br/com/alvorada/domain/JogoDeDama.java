package br.com.alvorada.domain;

public class JogoDeDama {

	public static void main(String[] args) {

		// declaração de variáveis
		String[][] dadosTabuleiro = {
				{ "    ", " PB ", "    ", " PB ", "    ", " PB ", "    ",
						" PB " },
				{ " PB ", "    ", " PB ", "    ", " PB ", "    ", " PB ",
						"    " },
				{ "    ", " PB ", "    ", " PB ", "    ", " PB ", "    ",
						" PB " },
				{ "    ", "    ", "    ", "    ", "    ", "    ", "    ",
						"    " },
				{ "    ", "    ", "    ", "    ", "    ", "    ", "    ",
						"    " },
				{ " PP ", "    ", " PP ", "    ", " PP ", "    ", " PP ",
						"    " },
				{ "    ", " PP ", "    ", " PP ", "    ", " PP ", "    ",
						" PP " },
				{ " PP ", "    ", " PP ", "    ", " PP ", "    ", " PP ",
						"    " } };

		int coordenadaOrigemColuna;
		int coordenadaOrigemLinha;
		int coordenadaDestinoColuna;
		int coordenadaDestinoLinha;
		boolean moverPeca = false;
		boolean proclamarVitoria = false;
		String corDoJogador;
		int contadorDasRodadas = 0;

		// iniciar partida
		do {

			contadorDasRodadas++;
			// classe que desenha o tabuleiro com os dados do array acima
			Tabuleiro.desenharTabuleiro(dadosTabuleiro);
			System.out.println();

			// determinar de quem é a vez de jogar
			if ((contadorDasRodadas % 2) == 0) {
				corDoJogador = "Preto";
			} else {
				corDoJogador = "Branco";
			}

			do {

				// pedir coordenadas de origem e destino da peça a ser movida
				String coordenadaOrigem = Teclado
						.capturarString("Qual peça deseja mover?\n(Exemplo: D5): ");
				System.out.println(coordenadaOrigem);
				String coordenadaDestino = Teclado
						.capturarString("Mover para onde?\n(Exemplo: D5)");
				System.out.println(coordenadaDestino);

				// coletar dados para testar se o movimento é´possível

				// TODO Editar a classe conversor e criar o código para as
				// conversões abaixo
				coordenadaOrigemColuna = Conversor
						.converterLetraEmNumero(coordenadaOrigem
								.substring(0, 1));
				coordenadaOrigemLinha = Conversor
						.converterStringEmNumero(coordenadaOrigem.substring(1,
								2));
				coordenadaDestinoColuna = Conversor
						.converterLetraEmNumero(coordenadaDestino.substring(0,
								1));
				coordenadaDestinoLinha = Conversor
						.converterStringEmNumero(coordenadaDestino.substring(1,
								2));

				String tipoDaPeca = dadosTabuleiro[coordenadaOrigemLinha][coordenadaOrigemColuna];

				// testar se a jogada pretendida pode ser executada
				boolean movimentoValido = Movimento.validarMovimento(
						dadosTabuleiro, coordenadaOrigemColuna,
						coordenadaOrigemLinha, coordenadaDestinoColuna,
						coordenadaDestinoLinha, corDoJogador, tipoDaPeca);

				// TODO editar a classe movimento e testar se o movimento
				// pretendido é válido.
				moverPeca = movimentoValido;

			} while (!moverPeca);

			// mover peça
			String variavelParaArmazenarAPecaASerTrocada = dadosTabuleiro[coordenadaOrigemLinha][coordenadaOrigemColuna];
			dadosTabuleiro[coordenadaOrigemLinha][coordenadaOrigemColuna] = "    ";
			dadosTabuleiro[coordenadaDestinoLinha][coordenadaDestinoColuna] = variavelParaArmazenarAPecaASerTrocada;

			// TODO editar a classe Vencedor e verificar se um dos jogadores
			// conseguiu remover todas as peças do adversário do tabuleiro
			proclamarVitoria = Vencedor.verificarVitoria(dadosTabuleiro);
		} while (proclamarVitoria);

		System.out.println("O jogador " + corDoJogador + "ganhou.");

	}
}
