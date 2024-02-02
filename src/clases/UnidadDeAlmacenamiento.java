package clases;

public abstract class UnidadDeAlmacenamiento {
    protected String brand;

    public UnidadDeAlmacenamiento(String brand) {
        this.brand = brand;
    }

    // Getter y Setter para brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}