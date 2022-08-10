package tarea;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tarea {
    static Scanner entradaTeclado = new Scanner(System.in);
    static int pares = 0;
    static int impares = 0;
    public static void main(String[] args) {
        System.out.println("ingrese numeros separados por coma (,)");
        String cadena = entradaTeclado.next();
        String[] cadenaNumero = cadena.split(","); 
        // A for loop that is iterating through the array of numbers.
        for (int i = 0; i < cadenaNumero.length; i++) {
            int number = Integer.parseInt(cadenaNumero[i]);
           
            if (number%2==0) {
                pares += number;
                System.out.println("Numero "+number+": "+"par");
            }else{
                impares += number;
                System.out.println("Numero "+number+": "+"impar");
            }
        }
        System.out.println("suma pares: " + pares);
        System.out.println("suma impares: " + impares);
        // Comparing the sum of even numbers with the sum of odd numbers.
        if (pares>impares) {
            System.out.println("la suma de pares es mayor que impares");
        }else{
            System.out.println("la suma de impares es mayor que pares");
        }
    }
    /**
     * It reads an integer from the keyboard and returns it
     * 
     * @param mensaje The message that will be displayed to the user.
     * @return The method is returning the number entered by the user.
     */
    static int leerNumero(String mensaje){
        System.out.println(mensaje);
        try{
            int numero = entradaTeclado.nextInt();
            entradaTeclado.nextLine();
            return numero;
        }catch(InputMismatchException exception){
            System.out.println("Dato no valido");
            entradaTeclado.nextLine();
            return -1;
        }
    }
}
