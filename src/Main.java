import clases.Cd;
import clases.DiscoDuro;
import clases.Vinilo;
import clases.BlueRay;
import interfaces.Almacenamiento;

public class Main {
    public static void main(String[] args) {

        Cd cd = new Cd("Sony");
        DiscoDuro discoDuro = new DiscoDuro("Corsair");
        Vinilo discoVinilo = new Vinilo("Vinyl Corp");
        BlueRay blueRay = new BlueRay("Samsung");


        System.out.println("--- CD ---");
        cd.girarDisco();
        cd.almacenarDatos();
        cd.leerDatos();
        cd.reportarInformacion();
        System.out.println();


        System.out.println("--- Disco Duro ---");
        discoDuro.girarDisco();
        discoDuro.almacenarDatos();
        discoDuro.leerDatos();
        discoDuro.reportarInformacion();
        System.out.println();


        System.out.println("--- Disco de Vinilo ---");
        discoVinilo.girarDisco();
        discoVinilo.almacenarDatos(); // No almacenana datos
        discoVinilo.leerDatos(); // No puede leer datos
        discoVinilo.reportarInformacion();
        System.out.println();

        
        System.out.println("--- BlueRay ---");
        blueRay.girarDisco();
        blueRay.almacenarDatos();
        blueRay.leerDatos();
        blueRay.reportarInformacion();
        System.out.println();

        // Polimorfismo
        Almacenamiento almacenamiento1 = cd;
        Almacenamiento almacenamiento2 = discoDuro;


        almacenamiento1.girarDisco();
        almacenamiento1.almacenarDatos();
        almacenamiento1.leerDatos();
        almacenamiento1.reportarInformacion();

        almacenamiento2.girarDisco();
        almacenamiento2.almacenarDatos();
        almacenamiento2.leerDatos();
        almacenamiento2.reportarInformacion();


    }
}
