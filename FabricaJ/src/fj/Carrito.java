package fj;

public class Peluche extends Juguete {
    private String materialExterior;
    private String relleno;

    public Peluche(String color, String materialExterior, String relleno) {
        super(color);
        this.materialExterior = materialExterior;
        this.relleno = relleno;
    }

    public String getMaterialExterior() {
        return materialExterior;
    }

    public void setMaterialExterior(String materialExterior) {
        this.materialExterior = materialExterior;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
}