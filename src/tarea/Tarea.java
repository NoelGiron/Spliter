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
        if (pares>impares) {
            System.out.println("la suma de pares es mayor que impares");
        }else{
            System.out.println("la suma de impares es mayor que pares");
        }
    }
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
