public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese X!" + "\n");
    int X = sc.nextInt();
    System.out.println("Usted ingreso: " + X + "\n");

    System.out.println("Ingrese Y!" + "\n");
    int Y = sc.nextInt();
    System.out.println("Usted ingreso: " + Y + "\n");

    X = X + Y;
    Y = X - Y;
    X = X - Y;

    System.out.println("Ahora X es: " + X + "\n" + "e Y es: " + Y);
}