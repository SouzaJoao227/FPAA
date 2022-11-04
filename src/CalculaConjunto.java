
import java.util.LinkedList;

public class CalculaConjunto {
	private LinkedList<Integer> resultReturn;
	private int[] conjunto;

	
	
	public CalculaConjunto(int[] conjunto) {
		this.conjunto = conjunto;
		resultReturn = new LinkedList<Integer>();
	}

	public boolean isSubsetSum(int sum) {
		return isSubsetSum( this.conjunto.length, sum);
	}

	// Árvore começa do último elemento do vetor
	private boolean isSubsetSum(int vetSize, int sum) {
		// Casos base

		if (sum == 0) {
			return true;
		}
		if (vetSize == 0) {
			return false;
		}
		// Desce na árvore até até o primeiro elemento à esquerda, note que mesmo
		// achando o valor exato ele continua descendo já que sum nunca será 0
		if (isSubsetSum( vetSize - 1, sum)) {
			return true;
		}
		// Subtrai o valor do nó de sum e guarda o valor na lista se existe um
		// subconjunto que satisfaz as condições
		if (isSubsetSum( vetSize - 1, sum - this.conjunto[vetSize - 1])) {
			resultReturn.add(this.conjunto[vetSize - 1]);
			return true;
		}

		return false;
	}

	public LinkedList<Integer> getResultReturn() {
		return this.resultReturn;
	}

}
