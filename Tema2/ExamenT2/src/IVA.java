import java.util.Scanner;

public class IVA {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.printf("¿Cuánto te ha costado la PS5?%n");
        double playStation= lecturaTeclado.nextDouble();
        System.out.printf("¿Cuanto te ha costado el iPhone 12?%n");
        double iPhone12 = lecturaTeclado.nextDouble();
        System.out.println("IVA aplicado en la operacion 21%");
        double ivaOperacion = 0.21;
        double totalF = playStation+iPhone12;
        double ivaFuera = (iPhone12 + playStation)* ivaOperacion;
        double totalSinIva = (iPhone12 + playStation) - ivaFuera;
        System.out.printf("El total de la factura con IVA es: %.2f%n",totalF);
        System.out.printf("Total de la factura sin IVA es: %.2f%n",totalSinIva);
        double dineroAhorrado = 1500;
        System.out.printf("Ahorros totales: %.2f%n" ,dineroAhorrado);

        boolean compra2Articulos = dineroAhorrado>=totalF;
        boolean compra1Articulo = dineroAhorrado>iPhone12 || dineroAhorrado>playStation;
        System.out.printf("¿Puedo comprar los dos articulos?%n"+compra2Articulos);
        System.out.printf("%n¿Puedo comprar al menos un articulo?%n"+compra1Articulo);


        //String nombre =;



    }
}
