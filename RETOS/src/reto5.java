package src;
import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empleado, cliente;
        double precio, totalProducto, total = 0;
        int cantidad, numProductos;
        boolean registro;

        System.out.print("Nombre del empleado: ");
        empleado = sc.nextLine();
        System.out.print("Nombre del cliente: ");
        cliente = sc.nextLine();
        System.out.print("¿El cliente está registrado? (true/false): ");
        registro = sc.nextBoolean();
        System.out.print("Ingrese el número de productos a comprar: ");
        numProductos = sc.nextInt();

        for (int i = 1; i <= numProductos; i++) {
            // Solicitamos los datos de cada producto
            System.out.println("Producto #" + i);
            System.out.print("Precio del producto: ");
            precio = sc.nextDouble();
            System.out.print("Cantidad del producto: ");
            cantidad = sc.nextInt();

            // Calculamos el total por producto
            totalProducto = precio * cantidad;

            if (registro) {
                totalProducto = totalProducto * 0;
            }

            // Imprimimos el total por producto
            System.out.println("Total por producto: " + totalProducto);

            // Sumamos el total por producto al total de la compra
            total += totalProducto;
        }

        // Imprimimos el total de la compra
        System.out.println("Total de la compra: " + total);

        // Solicitamos el pago y calculamos las vueltas
        double pago, vuelto;
        System.out.print("Ingrese el monto a pagar: ");
        pago = sc.nextDouble();
        if (pago < total) {
            System.out.println("No le alcanza el dinero.");
        } else {
            vuelto = pago - total;
            System.out.println("Vuelto: " + vuelto);
       }
    sc.close();
    empleado.strip();
    cliente.strip();
    }
}