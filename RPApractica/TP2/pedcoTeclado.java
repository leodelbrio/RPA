
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese nombre del producto!" + "\n");
    String nombreProducto = sc.nextLine();

    System.out.println("Ingrese el precio de la unidad!" + "\n");
    double precioUnitario = sc.nextDouble();

    System.out.println("Ingrese la cantidad del mismo!" + "\n");
    double cantidad = sc.nextDouble();

    double precioFinal = precioUnitario * cantidad;

    System.out.println("Usted lleva: " + nombreProducto + "\n"
        + " a un costo de :" + precioUnitario + "\n"
        + " y lleva: " + cantidad + "unidades del producto" + "\n"
        + " para terminar abonando: " + precioFinal
    );

}