package src;
import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        String nom_madre;
        String nom_bebe;
        int edad;
        double bebepeso;
        String vacuna;
        
        Scanner lectura=new Scanner (System.in);

        //solicitamos y capturar datos
        System.out.print("porfavor ingrese nombre de la madre: ");
        nom_madre=lectura.nextLine();
    
        System.out.print("porfavor ingrese nombre del bebe: ");
        nom_bebe=lectura.nextLine();

        System.out.print("porfavor ingrese nombre de la vacuna: ");
        vacuna=lectura.nextLine();
 
        System.out.print("porfavor ingrese la edad del bebe: ");
        edad=lectura.nextInt();

        System.out.print("porfavor ingrese el peso del bebe: ");
        bebepeso=lectura.nextInt();

        // peso
        int numero=10;
        double resultado1;
        resultado1=bebepeso+numero;
        System.out.println(resultado1);

        // meses
        int resultado2;
        resultado2=edad*numero;
        System.out.println(resultado2);

        // dosis
        double resultado3;
        resultado3=resultado1/resultado2;
        System.out.println(resultado3);

        // resultado dosis vacuna
        int numero2=8;
        double resultado4;
        resultado4=resultado3*numero2;
        System.out.println(resultado4);

        lectura.close();
        nom_madre.strip();
        nom_bebe.strip();
        vacuna.strip();
    }
}