package POO.UVA2.Ejercicio1;

public class Televisor {

String marca;
String modelo;
int anioFabricacion;
char tipo; //P=Plasma , L= LCD, O= Oled
int pulgadas;
String resolucion; //1080p, 4K)
char smart; //si o no


public Televisor (String marca, String modelo, int anioFabricacion, char tipo, int pulgadas, String resolucion, Char smart) {

    this.marca = marca;
    this.modelo = modelo;
    this.anioFabricacion = anioFabricacion;
    this.tipo = tipo;
    this.pulgadas = pulgadas;
    this.resolucion = resolucion;
    this.Smart = smart;
}

}