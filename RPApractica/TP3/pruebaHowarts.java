import java.util.Scanner;
public class main{

    public static int calcularDaño(int valAtaque){
        int numAlea = (int)(Math.random() * valAtaque) + 1;
        return numAlea;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre joven mago!: ");
        String nombreMago = sc.nextLine();

        System.out.println("Ingrese que tan fuerte es su varita!: ");
        int poder = sc.nextInt();

        if (poder > 20 || poder < 1) {
            System.out.println("Ingrse un valor valido joven mago!");
        }else{
        System.out.println("Su ataque fue de: " + calcularDaño(poder) + " puntos magicos!");
        }
        
    }

}
