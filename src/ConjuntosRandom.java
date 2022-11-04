import java.util.Random;

public class ConjuntosRandom {
    private static final int min = 1;
    private static final int max = 9;

    public static int GetRandom() {
        Random random = new Random();
        return random.ints(min, max + 1)
                .findFirst()
                .getAsInt();
    }
}
