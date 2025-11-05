/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author cmarq
 */
public class EVA3_1_METODOS {
    
    public static void main(String[] args) {
     //INVOLXAR EL METODO
     // LLAMADA A PROCEDIMIENTO O FUNCION
     //1. SI QUEREMOS RECUPERAR EL VALOR
     int resu = calcularCuadrado(4);
        System.out.println("El cuadrado de 10 es:" + resu);
        //2. USAR EL VALOR SIN GUARDARLO
        System.out.println("El cuadrado de 4 es:" + calcularCuadrado(4));
        //3. no me interesa el resultado
        calcularCuadrado(4);
    }
    //Modificadores
    //Mpdificador de acceso: public, private, protected, default
    //static --> se necesita para usar nuestros metodos en el main
    //Public Static
              //Valor de retorno (tipo de dato)
              //Nombre del metodo (usar verbo)
                   //LISTA DE PARAMETROS
                   //CERO O N CANTIDAD
    public static int calcularCuadrado(int num) { //ENCABEZADO (HEADER)
      //{} --> Implementacion del metodo (Cuerpo del metodo)
      int cuadrado = num * num; 
      return cuadrado; //regresamos el resultado
      //ya no se puede poner codigo aqui
        //System.out.println(""); //error, no se puede poner codigo despues del return
    }
    
    
}