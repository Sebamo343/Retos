package src;
import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        String Jugador;
        int eleccion;
        int apuesta;

        Scanner c = new Scanner(System.in);
    
        System.out.println("Ingrese su nombre: ");
        Jugador = c.nextLine();
    
        System.out.println("Ingrese su apuesta: ");
        apuesta = c.nextInt();
    
        // Verificar si la apuesta es mayor o igual a 10000
        if (apuesta < 10000) {
          System.out.println("La apuesta mínima es de 10000. Vuelve a intentarlo.");
          return;
        }

        
        int resultado = (int) (Math.random() * 3);
    
        System.out.println("¿Elija piedra, papel o tijera? (0=piedra, 1=papel, 2=tijera): ");
        eleccion = c.nextInt();
    
        // Verificar si la elección del jugador coincide con el resultado
        if (eleccion == resultado) {
          System.out.println("¡Felicidades, " + Jugador + "! Ganaste " + apuesta + " pesos.");
        } else {
          System.out.println("Lo siento, " + Jugador + ", perdiste " + apuesta + " pesos.");
        }

    Jugador.strip();
    c.close();
    } 
}