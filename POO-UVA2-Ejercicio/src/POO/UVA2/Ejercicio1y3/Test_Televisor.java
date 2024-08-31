package POO.UVA2.Ejercicio1y3;

public class Test_Televisor {
    public static void main(String[] args) throws Exception {
        Televisor tv1 = new Televisor("Samsung", "Series 9", 2023, 'O', 55, "4K", true);
        Televisor tv2 = new Televisor("Samsung", "Series 6", 2021, 'L', 55, "4K", true);
        Televisor tv3 = new Televisor("Samsung", "Series 4", 2018, 'P', 55, "1080p", false);
        Televisor tv4 = new Televisor("Samsung", "Series 8", 2022, 'L', 55, "4K", true);


        System.out.println("");
        System.out.println("TV 1");
        tv1.mostrarInformacion();
        tv1.mostrarEstado();

        System.out.println("");
        System.out.println("TV 2");
        tv2.mostrarInformacion();
        tv2.mostrarEstado();

        System.out.println("");
        System.out.println("TV 3");
        tv3.mostrarInformacion();
        tv3.mostrarEstado();

        System.out.println("");
        System.out.println("TV 4");
        tv4.mostrarInformacion();
        tv4.mostrarEstado();



    }
}
