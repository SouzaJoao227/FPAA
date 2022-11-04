public class GeradorSubConjuntos {

    public int[] gerarConjuntos(int size) {
        int[] retorno = new int[size];

        for (int x = 0; x < size; x++) {
            retorno[x] = ConjuntosRandom.GetRandom();
        }
        return retorno;
    }
}
