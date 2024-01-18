import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static fj.imprimir.imprimirJuguetes;


public class Principal {

    public static void main(String[] args) {

        List<Juguete> juguetes = new ArrayList<Juguete>();

        Scanner leer = new Scanner(System.in);
        int op;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1: Crear peluche");
            System.out.println("2: Crear carrito");
            System.out.println("3: Mostrar lista");
            System.out.println("4: Salir");
            op = leer.nextInt();

            if (op == 1) {
                System.out.println("Material exterior: ");
                String material = leer.next();
                System.out.println("Relleno: ");
                String relleno = leer.next();
                System.out.println("Color: ");
                String coloresPeluche = leer.next();
                juguetes.add(new Peluche(material, relleno, coloresPeluche));
                System.out.println("El juguete fue añadido a la lista");
            } else if (op == 2) {
                System.out.println("Color: ");
                String coloresCarrito = leer.next();
                System.out.println("Número de puertas: ");
                int numeroPuertas = leer.nextInt();
                System.out.println("Marca");
                String marca = leer.next();
                juguetes.add(new Carrito(coloresCarrito, numeroPuertas, marca));
                System.out.println("El juguete fue añadido a la lista");
            } else if (op == 3) {
                imprimirJuguetes();
            } else if (op == 4) {
                System.out.println("El programa ha sido cerrado");
            } else {
                System.out.println("Opción inválida");
            }
        } while (op != 4);
    }
}





