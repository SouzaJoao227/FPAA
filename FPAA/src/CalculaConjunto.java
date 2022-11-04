
import java.util.LinkedList;

public class CalculaConjunto {
    public static LinkedList<Integer> resultReturn = new LinkedList<Integer>();

    // Árvore começa do último elemento do vetor
    public static boolean isSubsetSum(int conjunto[],
            int vetSize, int sum) {
        // Casos base

        if (sum == 0) {
            return true;
        }
        if (vetSize == 0) {
            return false;
        }
        // Desce na árvore até até o primeiro elemento à esquerda, note que mesmo achando o valor exato ele continua descendo já que sum nunca será 0 
        if (isSubsetSum(conjunto, vetSize - 1, sum)) {
            return true;
        }
        // Subtrai o valor do nó de sum e guarda o valor na lista se existe um subconjunto que satisfaz as condições 
        if (isSubsetSum(conjunto, vetSize - 1, sum - conjunto[vetSize - 1])) {
            resultReturn.add(conjunto[vetSize - 1]);
            return true;
        }

        return false;
    }

}
