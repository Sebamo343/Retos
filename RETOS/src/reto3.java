package src;
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
        String Jugador;
        int eleccion;
        int apuesta;
        int resultado;

        Scanner c = new Scanner(System.in);
    
        System.out.println("Ingrese su nombre ");
        Jugador = c.nextLine();
    
        System.out.println("Ingrese su apuesta: ");
        apuesta = c.nextInt();
    
        // Verificar si la apuesta es menor a 10000
        if (apuesta<10000) {
          System.out.println("Debe apostar almenos 10000 para poder jugar");
          return;
        }
        
        resultado = (int) (Math.random() * 2);
    
        System.out.println("¿Cara o sello? (0 = cara, 1 = sello): ");
        eleccion = c.nextInt();
    
        // Verificar si la elección del jugador coincide con el resultado
        if (eleccion == resultado) {
          System.out.println("¡Felicitaciones " + Jugador + "! Ganaste " + apuesta + " pesos");
        } else {
          System.out.println("Lo siento " + Jugador + ", perdiste " + apuesta + " pesos");
        }

    Jugador.strip();
    c.close();
    }
}