
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int vetSize = sc.nextInt();

        System.out.println("Digite a soma que deve ser encontrada:");
        int vetSum = sc.nextInt();

        sc.close();

        int[] conjunto = GeradorSubConjuntos.GeradorDeConjuntos(vetSize);

        printVetor(conjunto);

        if (CalculaConjunto.isSubsetSum(conjunto, vetSize, vetSum) == true) {
            System.out.println("Subconjunto encontrado"
                    + " com o somatorio: " + vetSum);
            System.out.println(CalculaConjunto.resultReturn);
        } else
            System.out.println("Subconjunto não encontrado"
                    + " com o somatorio " + vetSum);
    }

    private static void printVetor(int[] vetor) {
        System.out.println("Vetor: ");
        System.out.print("[");
        for (int x = 0; x < vetor.length; x++) {
            
            System.out.print(vetor[x] + ",");
        }
        System.out.print("]");
        System.out.println();
    }
}
