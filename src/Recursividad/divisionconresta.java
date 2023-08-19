package Recursividad;

import java.util.Scanner;

public class divisionconresta {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        int cociente = 0;
        if (dividendo == 0){
            System.out.println("No se puede dividir");
        }else{
            int resultadoiterativo = divisionInteractiva(divisor, dividendo, cociente);
            int divisionrecursiva = divisionRecursiva(dividendo, divisor);
            System.out.println("El resultado del recursivo es: "+divisionrecursiva);
            System.out.println("El resultado del iterativo es: "+resultadoiterativo);
        }


    }

    public static int divisionRecursiva(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + divisionRecursiva(dividendo - divisor, divisor);
        }
    }
    public static int divisionInteractiva(int divisor, int dividendo, int cociente){

        while (dividendo >= divisor){
            dividendo -= divisor;
            cociente++;
        }
        return cociente;
    }
}