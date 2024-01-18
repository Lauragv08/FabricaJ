package fj;

public class imprimir {
    public static void imprimirJuguetes() {
        for (Juguete juguete : lista) {
            if (juguete instanceof Peluche) {
                imprimirPeluche((Peluche) juguete);
            } else if (juguete instanceof Carrito) {
                imprimirCarrito((Carrito) juguete);
            }
        }
    }

    public static void imprimirPeluche(Peluche peluche) {
        System.out.println("Peluche: Material: " + peluche.getMaterialExterior() +
                ", Relleno: " + peluche.getRelleno() +
                ", Color: " + peluche.getColor());
    }

    public static void imprimirCarrito(Carrito carrito) {
        System.out.println("Carrito: Marca: " + carrito.getMarca() +
                ", Número de puertas: " + carrito.getNumeroPuertas() +
                ", Color: " + carrito.getColor());
    }
}


