public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el primer numero" + "\n");
    int A = sc.nextInt();
    System.out.println("Usted ingreso: " + A + "\n");

    System.out.println("Ingrese el segundo numero" + "\n");
    int B = sc.nextInt();
    System.out.println("Usted ingreso: " + B + "\n");

    System.out.println("Ingrese el tercer numero" + "\n");
    int C = sc.nextInt();
    System.out.println("Usted ingreso: " + C + "\n");

    int D = 0;

    D = C;
    C = B;
    B = A;
    A = D;


    System.out.println("Ahora A es: " + A + " y B es: " + B +  " y C es: " + C + "\n");


}