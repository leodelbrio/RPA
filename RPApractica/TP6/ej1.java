public static void main (String[] args){
    for (int i = 0; i < 11; i++) {
        System.out.println(i);
    }

    for (int i = 10; i > 0; i--) {
        System.out.println("faltan " + i);
        if (i == 1) {
            System.out.println("DESPEGUE!");
        }
    }

    for (int i = 50; i < 101; i++) {
        if (i % 5 == 0) {
            System.out.println(i +" es divisible por 5");
        }   
    }

    int sumaTotal;
    sumaTotal = 0;

    for (int i = 1; i < 51; i++) {
        sumaTotal = sumaTotal + i;
    }

    System.out.println(sumaTotal);

    
}