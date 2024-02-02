package clases;
import interfaces.Almacenamiento;

public class Vinilo extends UnidadDeAlmacenamiento implements Almacenamiento {
    public Vinilo(String brand) {
        super(brand);
    }

    // Implementación de métodos de la interfaz Almacenamiento
    @Override
    public void girarDisco() {
        System.out.println("Disco de Vinilo girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Disco de Vinilo no almacena datos...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Disco de Vinilo no lee datos...");
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del Disco de Vinilo - Brand: " + getBrand());
    }
}
