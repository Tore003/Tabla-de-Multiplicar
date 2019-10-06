import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MostrarTabladeMultiplicacion {

    public static void MostrarTabladeMultiplicacion() throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int tamañoTabla;
        System.out.println("Ingrese un numero");
        tamañoTabla = Integer.parseInt(bufEntrada.readLine());
        // first print the top header row
        System.out.format("      ");
        for (int i = 1; i <= 12; ++i) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
        for (int i = 1; i <= 12; ++i) {
            // print left most column first
            System.out.format("%4d |", i);
            for (int j = 1; j <= 12; ++j) {
                System.out.format("%4d", tamañoTabla * j);
            }
            System.out.println();
        }
    }
}
