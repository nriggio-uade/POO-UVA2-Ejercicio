package POO.UVA2.Ejercicio1;

public class Televisor {

String marca;
String modelo;
int anioFabricacion;
String tipo; //P=Plasma , L=LCD, O=Oled
int pulgadas;
String resolucion; //1080p, 4K
boolean smart;


    public Televisor (String marca, String modelo, int anioFabricacion, String tipo, int pulgadas, String resolucion, boolean smart) {

     this.marca = marca;
     this.modelo = modelo;
     this.anioFabricacion = anioFabricacion;
     this.tipo = tipo;
     this.pulgadas = pulgadas;
     this.resolucion = resolucion;
     this.smart = true; 
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

    public boolean getSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

}