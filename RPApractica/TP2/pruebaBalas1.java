public static void main (String[] args){
    int cantidadBalas = 6;

    for (int i = 0; i < 7; i++) {

        if (cantidadBalas > 3) {
            System.out.println("estas bien de balas!");
            cantidadBalas = cantidadBalas -1;
        }else{
            if (cantidadBalas <= 3) {
                System.out.println(" TE QUEDAN POCAS BALAS AMIGO");
                cantidadBalas = cantidadBalas -1;
            } if (cantidadBalas == 0 ){
                System.out.println("RECARGA!!!");
            }
        }
    }
}
