import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        System.out.println("Hola Mundo");

        System.out.println("Ingrese 3 valores, uno por uno: ");

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1>n2 && n2>n3){
            System.out.println(""+n1);
            System.out.println(""+n2);
            System.out.println(""+n3);
        }
        else if (n1>n2 && n3>n2){
            System.out.println(""+n1);
            System.out.println(""+n3);
            System.out.println(""+n2);
        }

        else if (n2>n1 && n1>n3){
            System.out.println(""+n2);
            System.out.println(""+n1);
            System.out.println(""+n3);
        }
        else if (n2>n3 && n3>n1){
            System.out.println(""+n2);
            System.out.println(""+n3);
            System.out.println(""+n1);
        }
        else if (n3>n1 && n2>n1){
            System.out.println(""+n3);
            System.out.println(""+n2);
            System.out.println(""+n1);
        }
        else if (n3>n1 && n1>n2){
            System.out.println(""+n3);
            System.out.println(""+n1);
            System.out.println(""+n2);
        }
    }

}
