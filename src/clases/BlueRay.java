package clases;
import interfaces.Almacenamiento;

public class BlueRay extends UnidadDeAlmacenamiento implements Almacenamiento {
    public BlueRay(String brand) {
        super(brand);
    }


    @Override
    public void girarDisco() {
        System.out.println("BlueRay girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("BlueRay almacenando datos...");
    }

    @Override
    public void leerDatos() {
        System.out.println("BlueRay leyendo datos...");
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del BlueRay - Brand: " + getBrand());
    }
}
