package POO.UVA2.Ejercicio1;

public class Test_TeleP {
    public static void main(String[] args) throws Exception {
        TeleP tv1 = new TeleP("Samsung", "Series 9", 2023, 'O', 55, "4K", true);
        TeleP tv2 = new TeleP("Samsung", "Series 6", 2021, 'L', 55, "4K", true);
        TeleP tv3 = new TeleP("Samsung", "Series 4", 2018, 'P', 55, "1080p", false);
        TeleP tv4 = new TeleP("Samsung", "Series 8", 2022, 'L', 55, "4K", true);

        
        System.out.println("");
        System.out.println("TV 1");
        System.out.println(tv1);

        System.out.println("");
        System.out.println("TV 2");
        System.out.println(tv2);

        System.out.println("");
        System.out.println("TV 3");
        System.out.println(tv3);

        System.out.println("");
        System.out.println("TV 4");
        System.out.println(tv4);
    }
}
