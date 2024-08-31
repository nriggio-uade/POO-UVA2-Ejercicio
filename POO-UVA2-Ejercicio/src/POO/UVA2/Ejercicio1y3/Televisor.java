package POO.UVA2.Ejercicio1y3;
import POO.UVA2.Ejercicio2.Pantalla;

public class Televisor {

 // Atributos
 private String marca;
 private String modelo;
 private int anioFabricacion;
 private char tipo; // P: Plasma, L: LED, O: OLED
 private int pulgadas;
 private String resolucion; //1080p, 4K
 private boolean smart;
 private boolean encendido;
 public Pantalla pantalla;

 // Constructor
 public Televisor(String marca, String modelo, int anioFabricacion, char tipo, int pulgadas, String resolucion, boolean smart) {
     this.marca = marca;
     this.modelo = modelo;
     this.anioFabricacion = anioFabricacion;
     this.tipo = tipo;
     this.pulgadas = pulgadas;
     this.resolucion = resolucion;
     this.smart = smart;
     this.encendido = false;
     this.pantalla = new Pantalla();
 }

//Getters and setters
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

 public char getTipo() {
    return tipo;
}

 public void setTipo(char tipo) {
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

 public boolean isSmart() {
    return smart;
}

 public void setSmart(boolean smart) {
    this.smart = smart;
}

public void encender() {
    encendido = true;
}

public void apagar() {
    encendido = false;
}

public String getEstado() {
    return encendido ? "Encendida" : "Apagada";
}

public boolean isEncendido() {
    return encendido;
}

public void setEncendido(boolean encendido) {
    this.encendido = encendido;
}

//Método para mostrar información de TV
 public void mostrarInformacion() {
    String tipoPantalla = "";
    switch (tipo) {
        case 'P':
            tipoPantalla = "Plasma";
            break;
        case 'L':
            tipoPantalla = "LED";
            break;
        case 'O':
            tipoPantalla = "OLED";
            break;
    }
    System.out.println(marca + " " + modelo + " -- " + pulgadas + " pulgadas -- " + resolucion + " -- " + (smart ? "Smart" : "No Smart") + " -- Pantalla: " + tipoPantalla + " " + "con brillo configurado de fábrica de " + pantalla.getBrillo());
}

//Método para mostrar Estado de TV
public void mostrarEstado() { 
    System.out.println("La TV está: " + getEstado());
}

}