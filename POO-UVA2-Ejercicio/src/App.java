import POO.UVA2.Ejercicio1y3.Televisor;

public class App{
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", "Series 9", 2023, 'O', 55, "4K", true);
        Televisor tv2 = new Televisor("Samsung", "Series 4", 2018, 'P', 55, "1080p", false);

        //Muestro info y estado de TV1
        System.out.println("");
        System.out.println("-------TV 1-------");
        tv1.mostrarInformacion();
        tv1.mostrarEstado();

        //Cambio configuración de brillo de fábrica de la pantalla de TV1
        System.out.println("");
        System.out.println("Cambiar la configuración del brillo de fábrica a 100%");
        tv1.pantalla.masBrillo();
        System.out.println("Ahora la configuración del brillo de fábrica es de: " + tv1.pantalla.getBrillo());
        //Muestro info de configuración cambiada para TV1
        System.out.println("");
        System.out.println("Muestro Info de TV1 con nueva configuración de pantalla:");
        tv1.mostrarInformacion();

        //Enciendo y apago TV1
        System.out.println("");
        System.out.println("ENCENDER TV1");
        tv1.encender();
        System.out.println("La TV1 está: " + tv1.getEstado());

        System.out.println("");
        System.out.println("APAGAR TV1");
        tv1.apagar();
        System.out.println("La TV1 está: " + tv1.getEstado());

    
        //Muestro info y estado de TV2
        System.out.println("");
        System.out.println("-------TV2-------");
        tv2.mostrarInformacion();
        tv2.mostrarEstado();

        //Cambio configuración de brillo de fábrica de la pantalla de TV2
        System.out.println("");
        System.out.println("Cambiar la configuración del brillo de fábrica a 100%");
        tv2.pantalla.masBrillo();
        System.out.println("Ahora la configuración del brillo de fábrica es de: " + tv2.pantalla.getBrillo());
       //Muestro info de configuración cambiada para TV1
        System.out.println("");
        System.out.println("Muestro Info de TV1 con nueva configuración de pantalla:");
        tv1.mostrarInformacion();



        //Enciendo y apago TV2
        System.out.println("");
        System.out.println("ENCENDER TV2");
        tv2.encender();
        System.out.println("La TV2 está: " + tv2.getEstado());
        
        System.out.println("");
        System.out.println("APAGAR TV2");
        tv2.apagar();
        System.out.println("La TV2 está: " + tv2.getEstado());
    
    }
}
