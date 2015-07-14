package tpFinal;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PlainTextConsole {
    
    public static void option1(List<String> sequences) {
        //Implementar este metodo y los metodos que sean necesarios
    }
    
    public static void option2() {
        //Implementar este metodo y los metodos que sean necesarios
    }
    
    public static void option3() {
        //Implementar este metodo y los metodos que sean necesarios
    }
    
    public static void option4() {
        //Implementar este metodo y los metodos que sean necesarios
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Scanner para obtener el input del usuario

        sc.useDelimiter(Pattern.compile("\n")); //Setea el ENTER como fin de linea para el input del usuario
        
        String saludo = "Hola Mundo!"; //Defino un saludo a imprimir
     
        System.out.println("Bienvenidos al TP Final de 71.44!!"); //Mensaje de bienvenida

        while(true) {
            //Imprimimos el men� ante cada input del usuario
            System.out.println("\tMen� del programa:");
            System.out.println("\tIngrese 1 para comenzar a ingresar secuencias de nucle�tidos separadas por la tecla ENTER. Al finalizar, ingrese q o Q seguido de ENTER");
            System.out.println("\tIngrese 2 para imprimir en pantalla todas las secuencias v�lidas ingresadas previa conversi�n mediante complemento y reversa.");
            System.out.println("\tIngrese 3 para imprimir en pantalla todas las secuencias inv�lidas en pantalla en el mismo orden en que fueron ingresadas por el usuario.");
            System.out.println("\tIngrese 4 para imprimir en pantalla todas las secuencias inv�lidas y que no est�n en formato de c�digo gen�tico en el orden inverso al que las ingres� el usuario.");
            System.out.println("\tIngrese Q para salir.");

            String opcion = sc.next(); //Lee una linea de input del usuario
            
            if (opcion.equalsIgnoreCase("1")) { //eliji� la opci�n 1
                while (true) {
                    List<String> sequences = new LinkedList<>();
                    String sequence = sc.next(); //Lee una linea de input del usuario
                    if (sequence.equalsIgnoreCase("q")) {
                        option1(sequences);
                        break;
                    } else {
                        sequences.add(sequence);
                    }
                }   
            } else if (opcion.equalsIgnoreCase("2")) {
                option2();
            } else if (opcion.equalsIgnoreCase("3")) {
                option3();
            } else if (opcion.equalsIgnoreCase("4")) {
                option4();
            } else if (opcion.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("No ingres� una opci�n correcta");
            }
        }
        
        System.out.println("Gracias por utilizar este programa!");
        System.out.println("Hasta Luego!");
        
        sc.close();
        
    }
}
	

