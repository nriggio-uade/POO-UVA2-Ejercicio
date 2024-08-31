package POO.UVA2.Ejercicio2;

public class Pantalla {
    private boolean brillo;


    public void masBrillo() {
        brillo = true;
    }

    public void menosBrillo(){
        brillo = false;
    }

    public String getBrillo(){
        return brillo ? "100%" : "80%";
    }  
    
    public boolean isBrillo() {
        return brillo;
    }

    public void setBrillo(boolean brillo) {
        this.brillo = brillo;
    }
    
   
   
}

