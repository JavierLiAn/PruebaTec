epackage clases;

import interfaces.Almacenamiento;

public class DiscoDuro extends UnidadDeAlmacenamiento implements Almacenamiento {
    public DiscoDuro(String brand) {
        super(brand);
    }

    @Override
    public void girarDisco() {
        System.out.println("Disco Duro en ejecución...");
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
        System.out.println("Información del Disco Duro - Brand: " + getBrand()); 
    }
}
