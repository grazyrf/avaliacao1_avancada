import java.util.ArrayList;
import java.util.List;

public class DistribuicaoRotas {
    public static void main(String[] args) {
        int numDrivers = 100;
        int numRotas = 900;

        List<List<Integer>> rotasParaDrivers = distribuirRotas(numDrivers, numRotas);

        for (int i = 0; i < numDrivers; i++) {
            System.out.println("Driver " + (i + 1) + " receberá as rotas: " + rotasParaDrivers.get(i));
        }
    }

    public static List<List<Integer>> distribuirRotas(int numDrivers, int numRotas) {
        List<List<Integer>> rotasParaDrivers = new ArrayList<>();
        int rotasPorDriver = numRotas / numDrivers;
        int rotasExtras = numRotas % numDrivers;

        int rotaAtual = 1;

        for (int i = 0; i < numDrivers; i++) {
            int rotasParaEsteDriver = rotasPorDriver;
            if (i < rotasExtras) {
                rotasParaEsteDriver++;
            }

            List<Integer> rotas = new ArrayList<>();
            for (int j = 0; j < rotasParaEsteDriver; j++) {
                rotas.add(rotaAtual);
                rotaAtual++;
            }

            rotasParaDrivers.add(rotas);
        }

        return rotasParaDrivers;
    }
}
