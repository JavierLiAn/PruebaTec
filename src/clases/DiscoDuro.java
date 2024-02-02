package clases;

import interfaces.Almacenamiento;

public class DiscoDuro extends UnidadDeAlmacenamiento implements Almacenamiento {
    public DiscoDuro(String brand) {
        super(brand);
    }

    // Implementación de métodos de la interfaz Almacenamiento
    @Override
    public void girarDisco() {
        System.out.println("Disco Duro girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Disco Duro almacenando datos...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Disco Duro leyendo datos...");
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del Disco Duro - Brand: " + getBrand()); // Corrección aquí
    }
}
