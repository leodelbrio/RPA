public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("ingrese la temp");
    double temp = sc.nextDouble();

    if (temp > 75) {
        System.out.println("ALERTA!");
    } else {
        System.out.println("Esta todo bien!");
    }
}