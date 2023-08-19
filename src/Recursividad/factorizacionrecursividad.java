package Recursividad;
class FactorialCalculator {

    public static int calcularFactorial(int numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }

    public static long calcularFactorial(long numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }

    public static long calcularFactorialIterativo(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

public class factorizacionrecursividad {
    public static void main(String[] args) {
        int numero1 = 5;
        long numero2 = 10;

        int factorialRecursivo1 = FactorialCalculator.calcularFactorial(numero1);
        long factorialRecursivo2 = FactorialCalculator.calcularFactorial(numero2);

        long factorialIterativo1 = FactorialCalculator.calcularFactorialIterativo(numero1);
        //long factorialIterativo2 = FactorialCalculator.calcularFactorialIterativo(numero2);

        System.out.println("Factorial de " + numero1 + " (recursivo): " + factorialRecursivo1);
        System.out.println("Factorial de " + numero2 + " (recursivo): " + factorialRecursivo2);
        System.out.println("Factorial de " + numero1 + " (iterativo): " + factorialIterativo1);
        //System.out.println("Factorial de " + numero2 + " (iterativo): " + factorialIterativo2);
    }
}
