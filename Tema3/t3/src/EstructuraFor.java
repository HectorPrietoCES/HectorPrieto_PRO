public class EstructuraFor {

/*for (inicio; final: incremento){
        ejecuciones
    }
for (int i=0;i<10;i++){
        System.out.println("Ejecución número: "+i);
 */

    public static void main(String[] args) {
        estructuraFor();
    }

    private static void estructuraFor(){
        for (int i=0;i<=5;i++){
            System.out.println("Incremental");
            System.out.println("Ejecucion"+1);
        }
        for (int i=-10;i<0;i--){
            System.out.println("decremental");
        }
    }
}
