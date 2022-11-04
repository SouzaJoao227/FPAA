import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		final GeradorSubConjuntos gerador = new GeradorSubConjuntos();
		final File file = new File("Documentação/log file.txt");
		file.createNewFile();
		final BufferedWriter logger = new BufferedWriter(new FileWriter(file));
		long tempo = 0;
		long tempoInicio, tempoFim;
		System.out.println("Início");
		for (int i = 2; tempo < 4000 && i <= 150; i++) {

			int[] conj = gerador.gerarConjuntos(i);
			int soma = calculaValorMetade(conj);

			final CalculaConjunto calculador = new CalculaConjunto(conj);

			tempoInicio = System.currentTimeMillis();
			calculador.isSubsetSum(soma);
			tempoFim = System.currentTimeMillis();
			tempo = tempoFim - tempoInicio;
			
			loggar(i, tempo, soma, conj, calculador.getResultReturn(), logger);

		}
		System.out.println("Dados armazenados no path Documentação/log file.txt");
		System.out.println("Fim");
		logger.close();

	}

	private static void loggar(int tamanho, long tempo, int soma, int[] conj, List<Integer> subConjunto, BufferedWriter logger) {

		StringBuilder saida = new StringBuilder();

		saida.append("tamanho: ");
		saida.append(tamanho);
		saida.append("\t");
		saida.append("tempo: ");
		saida.append(tempo);
		saida.append("\t");
		saida.append("soma: ");
		saida.append(soma);
		saida.append("\t");
		saida.append("conjunto: ");
		saida.append(Arrays.toString(conj));
		saida.append("\t");
		saida.append("sub conjunto: ");
		saida.append(subConjunto);

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
