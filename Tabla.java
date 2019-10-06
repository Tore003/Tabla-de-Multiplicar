import java.io.IOException;
import java.util.Scanner;

public class Tabla {

    public static void main(String[] args) throws IOException {
        /* int n, c;
      System.out.println("Ingrese un numero entero");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      System.out.println("La tabla de multiplicacion de: " + n + " es : ");
 
      for (c = 1; c <= 12; c++)
         System.out.println(n + "*" + c + " = " + (n*c));
         */
        MostrarTabladeMultiplicacion llamarTabla = new MostrarTabladeMultiplicacion();
        llamarTabla.MostrarTabladeMultiplicacion();

    }
}
