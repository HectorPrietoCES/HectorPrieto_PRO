import java.util.Hashtable;

public class entrada {

    public static void main(String[] args) {

        Hashtable<String, Object[]> listaCoches = new Hashtable<String, Object[]>();
        System.out.println(listaCoches.size());
        //el tamaño deberia ser 0 por que la lista no tiene nada dentro

        listaCoches.put("1234A", new Object[]{"1234A", "Mercedes", "C200", 200});
        Object[] coche = new Object[]{"1234B", "Nissan", "GT", 300};
        listaCoches.put(coche[0].toString(), coche);
        System.out.println(listaCoches.size());
        //el tamaño es de 2

        Object[] cocheEncontrado = listaCoches.get("1234A");
        System.out.println(cocheEncontrado[1]);

        Object[] cocheBorrado = listaCoches.remove("1234B");
        if (cocheBorrado==null){
            System.out.println("No existe el coche en la lista");
        } else {
            System.out.println("Coche borrado correctamente "+cocheBorrado[1]);
        }


        listaCoches.remove("1234A");




    }
}
