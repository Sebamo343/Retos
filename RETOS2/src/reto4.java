import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingresa la cantidad de columnas: ");
        int columnas= scanner.nextInt();
        


        String[][] emoji = new String[filas][columnas];
        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print("Ingresa el emoji para [" + fila + "][" + columna + "]: ");
                emoji[fila][columna] = scanner.next();
            }
        }

        
        for (int fila = 0; fila < filas ; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print(emoji[fila][columna] + " ");
            }
            System.out.println();
            scanner.close();
        }
    }
}
