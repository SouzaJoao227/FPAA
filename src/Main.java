import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	private static final int tempoLimite = 4000;
	private static final int qtdRepeticoes = 150;

	public static void main(String[] args) throws Exception {

		final GeradorSubConjuntos gerador = new GeradorSubConjuntos();
		long tempoMedio, tempoInicio, tempoFim;
		tempoMedio = 0;
		System.out.println("Início");

		final BufferedWriter loggerTempo = createFile("Documentação/log file.txt");
		final BufferedWriter loggerSolucao = createFile("Documentação/solucoes.txt");

		for (int tam = 2; tempoMedio < tempoLimite; tam++) {
			long tempo = 0;
			for (int i = 0; i < qtdRepeticoes; i++) {
				System.out.println(tam + ": rep: " + i);
				int[] conj = gerador.gerarConjuntos(tam);
				int soma = calculaValorMetade(conj);
				
				final CalculaConjunto calculador = new CalculaConjunto(conj);
				tempoInicio = System.currentTimeMillis();
				calculador.isSubsetSum(soma);
				tempoFim = System.currentTimeMillis();
				tempo += tempoFim - tempoInicio;

				loggarSolucao(soma, conj, calculador.getResultReturn(), loggerSolucao);

			}
			tempoMedio = tempo / qtdRepeticoes;
			loggarTempo(tam, tempoMedio, loggerTempo);

		}
		System.out.println("Dados armazenados no path Documentação/log file.txt");
		System.out.println("Fim");
		loggerTempo.close();
		loggerSolucao.close();
	}

	private static BufferedWriter createFile(String fileName) {
		try {
			File file = new File(fileName);
			file.createNewFile();
			return new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			return null;
		}
	}

	private static void loggarSolucao(int soma, int[] conjunto, List<Integer> solucao, BufferedWriter logger) {
		StringBuilder saida = new StringBuilder();

		saida.append("Conjunto: ");
		saida.append(Arrays.toString(conjunto));
		saida.append("\tsoma: ");
		saida.append(soma);
		saida.append("\tsolução");
		saida.append(solucao);

		try {
			logger.write(saida.toString());
			logger.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loggarTempo(int tamanho, long tempo, BufferedWriter logger) {

		StringBuilder saida = new StringBuilder();

		saida.append("tamanho: ");
		saida.append(tamanho);
		saida.append("\t");
		saida.append("tempo medio: ");
		saida.append(tempo);

		try {
			logger.write(saida.toString());
			logger.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int calculaValorMetade(int[] vetor) {
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		return soma / 2;
	}

}
