package POO.UVA2.Ejercicio1;

public class Test_Televisor {
    public static void main(String[] args) throws Exception {
    
        Televisor tele1= new Televisor("Samsung", "Serie 6", 2021, "L", 55, "4K", true);
        Televisor tele2= new Televisor("Samsung", "Serie 9", 2024, "O", 55, "4K", true);
        Televisor tele3= new Televisor("Samsung", "Serie 4", 2018, "P", 55, "4K", false);
        Televisor tele4= new Televisor("Samsung", "Serie 8", 2022, "L", 55, "4K", true);



        System.out.println("");
        System.out.println(" --- TELE 1 --- ");
        System.out.println("");
        System.out.print(tele1.getMarca() + " " + tele1.getModelo() + " -- " + tele1.getPulgadas() + " pulgadas -- " + tele1.getResolucion() + " -- ");
            if(tele1.isSmart()==true){
                System.out.print("Smart");
            }
            else {
                System.out.print("No Smart");
            }
        System.out.println("");
        
        System.out.println(" --- TELE 2 --- ");
        System.out.println("");
        System.out.print(tele2.getMarca() + " " + tele2.getModelo() + " -- " + tele2.getPulgadas() + " pulgadas -- " + tele2.getResolucion() + " -- ");
            if(tele2.isSmart()==true){
            System.out.print("Smart");
            }
            else {
            System.out.print("No Smart");
            }
            System.out.println("");
    
            System.out.println("");
            System.out.println(" --- TELE 3 --- ");
            System.out.println("");
            System.out.print(tele3.getMarca() + " " + tele3.getModelo() + " -- " + tele3.getPulgadas() + " pulgadas -- " + tele3.getResolucion() + " -- ");
                if(tele3.isSmart()==true){
                    System.out.print("Smart");
                }
                else {
                    System.out.print("No Smart");
                }
            System.out.println("");
                
            System.out.println("");
            System.out.println(" --- TELE 4 --- ");
            System.out.println("");
            System.out.print(tele4.getMarca() + " " + tele4.getModelo() + " -- " + tele4.getPulgadas() + " pulgadas -- " + tele4.getResolucion() + " -- ");
                if(tele4.isSmart()==true){
                System.out.print("Smart");
                }
                else {
                System.out.print("No Smart");
                }
            System.out.println("");
            
        }
    }
