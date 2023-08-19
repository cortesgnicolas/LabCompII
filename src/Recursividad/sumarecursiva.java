package Recursividad;

import java.util.Scanner;

public class sumarecursiva {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();

        int numerorecursivo = sumarecursiva(numero);
        System.out.println("La sumatoria recursiva es: "+numerorecursivo);

    }
    public static int sumarecursiva(int numero){
        if (numero <= 0){
            return 0;
        }else{
            return numero + sumarecursiva(numero-1);
        }
    }
}
