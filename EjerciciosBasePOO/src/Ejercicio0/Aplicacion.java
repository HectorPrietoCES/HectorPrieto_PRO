package Ejercicio0;

public class Aplicacion {
    public static void  main (String[] args){
        Motor m = new Motor(250);
        Coche c = new Coche("Marca","Modelo");
        c.setMotor(m);
        //sacar por consola los cv del motor del coche?
        System.out.println(c.getMotor().getCv());
        //marca = "Marca", modelo= "Modelo", motor =[Motor(cv=100,litrosAceite=0)]




    }
                // Crea un método (mostrarDatos) que muestre todos los datos del coche
                // Marca: XXXX
                // Modelo: XXXX
                // Averias acumuladas : XXXX
                // Motor:
                        // CV: XXX
                        // Litros Aceite: XXX
}
