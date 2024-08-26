package POO.UVA2.Ejercicio1;

public class Test_Televisor {
    public static void main(String[] args) throws Exception {
    
        Televisor tele1= new Televisor("Samsung", "Serie 6", 2021, "L", 55, "4K", true);

        System.out.println("");
        System.out.println(" --- TELE 1 --- ");
        System.out.println("");
        System.out.print(tele1.getMarca() + " " + tele1.getModelo() + " -- " + tele1.getPulgadas() + " pulgadas -- " + tele1.getResolucion() + " -- ");
            if(tele1.isSmart()==true){ //Por qué no funciona????????
                System.out.print("Smart");
            }
            else {
                System.out.print("No Smart");
            }
        }
    }
