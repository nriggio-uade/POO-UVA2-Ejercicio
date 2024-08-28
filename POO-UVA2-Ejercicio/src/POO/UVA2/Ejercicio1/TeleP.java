package POO.UVA2.Ejercicio1;

public class TeleP {

 // Atributos
 private String marca;
 private String modelo;
 private int anioFabricacion;
 private char tipo; // P: Plasma, L: LED, O: OLED
 private int pulgadas;
 private String resolucion; //1080p, 4K
 private boolean smart;

 // Constructor
 public TeleP(String marca, String modelo, int anioFabricacion, char tipo, int pulgadas, String resolucion, boolean smart) {
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


 // Método para obtener los datos de televisor
 public String toString() {
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
         default:
             tipoPantalla = "Desconocido";
     }

     String smartString = smart ? "Smart" : "No Smart";

     return getMarca() + " " + getModelo() + " -- " + getPulgadas() + " pulgadas -- " + getResolucion() + " -- " + tipoPantalla + " -- " + smartString;
 }

}

