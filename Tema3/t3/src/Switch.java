public class Switch {

    public static void main(String[] args) {
        int numero = 7;

        switch (numero) {
            case 1:
                System.out.println("el numero tiene un valor de 1");
                break;

            case 2:
                System.out.println("el numero tiene un valor de 2");
                break;
            case 7:
                System.out.println("el numero tiene un valor de 7");
                break;
            default:
                System.out.println("Caso no comtemplado");
        }
    }
}
