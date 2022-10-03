/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openbootcamp;

/**
 *
 * @author Elvis Enrique
 */
public class OpenBootCamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Primera parte del Ejercicio        
        int resultado;
        resultado = suma(24, 5, 18);
        System.out.println("El Total de la Suma es: " + resultado);
        
        // Segunda parte del Ejercicio
        Coche miCoche = new Coche();
        miCoche.addPuertas();        
        System.out.println("El número de Puertas que tiene el Coche es: " + miCoche.numPuertas);
    }
    
    // Función Suma
    public static int suma(int a, int b, int c){
    return a + b + c;
        }
}

// Clase Coche
class Coche{
    public int numPuertas = 3;
    
    // Función que incrementa el número de puertas
    public void addPuertas(){
        this.numPuertas++;        
}
    
}