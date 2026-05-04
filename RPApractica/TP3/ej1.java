public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    System.out.println("Ingrese la temperatura en celsius: " + "\n");
    double tempEnCel = sc.nextDouble();

    double tempEnFar = (tempEnCel * 1.8) + 32;

    System.out.println("Su temperatura en farenheit es: " + tempEnFar);



}