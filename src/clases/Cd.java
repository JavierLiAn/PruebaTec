package clases;

import interfaces.Almacenamiento;

public class Cd extends UnidadDeAlmacenamiento implements Almacenamiento {
    public Cd(String brand) {
        super(brand);
    }

    @Override
    public void girarDisco() {
        System.out.println("CD girando...");
    }

    @Override
    public void almacenarDatos() {
        System.out.println("CD almacenando datos...");
    }

    @Override
    public void leerDatos() {
        System.out.println("CD leyendo datos...");
    }

    @Override
    public void reportarInformacion() {
        System.out.println("Información del CD - Brand: " + getBrand()); 
    }
}
