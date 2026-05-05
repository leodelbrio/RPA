
import java.util.Scanner;

public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero! " + "\n");
    int num1 = sc.nextInt();
    System.out.println("Su numero ingresado es: " + num1 + "\n");

    System.out.println("Ingrese otro numero" + "\n");
    int num2 =sc.nextInt();
    System.out.println("Su numero ingresado es: " + num2 + "\n");

    if (num1 > num2) {
        System.out.println(num1 + " es mayor que " + num2);
    };

    if (num1 < num2) {
        System.out.println(num1 + " es menor que " + num2);
    };

    if (num1 == num2) {
        System.out.println("Son iguales!" + "\n");
    };

    if (num1 != num2) {
        System.out.println("y son distintos" + "\n");
    };
}