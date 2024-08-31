package POO.UVA2.Ejercicio2;

public class Test_Pantalla {
    public static void main(String[] args) throws Exception {

        Pantalla pantalla_test = new Pantalla();

        System.out.println("");
        System.out.println("La pantalla tiene un brillo configurado de fábrica de: " + pantalla_test.getBrillo());
        System.out.println("");

        System.out.println("AUMENTAR BRILLO");
        pantalla_test.masBrillo();
        System.out.println("");

        System.out.println("");
        System.out.println("Ahora, la pantalla tiene un brillo configurado de fábrica de: " + pantalla_test.getBrillo());
        System.out.println("");

}
}