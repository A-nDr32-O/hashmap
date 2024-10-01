/*
Nombre: Andrés Felipe Ortega Cárdenas
 */

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String color = "";
        String tra = "";
        String op;

        Scanner teclado = new Scanner(System.in);

        HashMap <String, String> traducccion = new HashMap<>();

        traducccion.put("Rojo", "Red");
        traducccion.put("Azul", "Blue");
        traducccion.put("Amarillo", "Yellow");
        traducccion.put("Negro", "Black");

        System.out.println(traducccion.keySet());

        System.out.print("Elige un color:");
        color = teclado.next();

        tra = traducccion.get(color);


        if (tra != null){
            System.out.println("La traduccion es: "+ tra);
        }else {
            System.out.println("El colo no esta. ");
        }

    }
}