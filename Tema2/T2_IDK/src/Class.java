public class Class {

    public static void main(String[] args) {

        System.out.printf("El precio de la factura total con IVA es %,2f%n",facturaJavaiva());
        System.out.printf("El precio de la factura total sin IVA es %,2f%n",facturaJavasiniva());
    }


    private static double facturaJavaiva() {
        double iPhone = 799;
        double airPods = 275;
        double Mac = 1250;
        double applewatch = 650;
        double iPad = 499;

        double suma =iPhone + airPods + Mac + applewatch + iPad;
        return suma;


    }private static double facturaJavasiniva() {
        double iPhone = 799;
        double airPods = 275;
        double Mac = 1250;
        double applewatch = 650;
        double iPad = 499;

        double iva = 0.25;
        double suma =iva*iPhone + iva*airPods + iva*Mac + iva*applewatch + iva*iPad;
        return suma;


    }


}
