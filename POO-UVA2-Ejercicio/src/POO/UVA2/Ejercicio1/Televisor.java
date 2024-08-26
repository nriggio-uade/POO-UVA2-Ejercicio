package POO.UVA2.Ejercicio1;

public class Televisor {

private String marca;
private String modelo;
private int anioFabricacion;
private String tipo; //P=Plasma , L=LCD, O=Oled
private int pulgadas;
private String resolucion; //1080p, 4K
private boolean smart;


    public Televisor (String marca, String modelo, int anioFabricacion, String tipo, int pulgadas, String resolucion, boolean smart) {

     this.marca = marca;
     this.modelo = modelo;
     this.anioFabricacion = anioFabricacion;
     this.tipo = tipo;
     this.pulgadas = pulgadas;
     this.resolucion = resolucion;
     this.smart = smart; 
    }
 
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAnioFabricacion() {
        return anioFabricacion;
    }


    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public int getPulgadas() {
        return pulgadas;
    }


    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }


    public String getResolucion() {
        return resolucion;
    }


    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void smart() {
        this.smart = true;
    }

    public void noSmart() {
        this.smart = false;
    }

    public boolean isSmart() {
        return smart;
    }

}