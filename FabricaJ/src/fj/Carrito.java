package fj;

public class Carrito extends Juguete {
    private String marca;
    private int numeroPuertas;

    public Carrito(String color, int numeroPuertas, String marca) {
        super(color);
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}