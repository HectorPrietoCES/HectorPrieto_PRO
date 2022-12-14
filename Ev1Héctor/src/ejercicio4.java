public class ejercicio4 {
    public static void main(String[] args) {

        String frase = "En este ejercicio vamos a evaluar la cantidad de elementos de una frase, separando por oraciones." +
                "Esto es otro elemento sobre el que evaluar el resultado ";
        System.out.println(frase);

        String [] frase1= {"En","este","ejercicio","vamos","a","evaluar","la","cantidad","de","elementos","de","una","frase","separando","por","oraciones",
                "Esto","es","otro","elemento","sobre","el","que","evaluar","el","resultado"};
        Object [] frase2 = {"En","este","ejercicio","vamos","a","evaluar","la","cantidad","de","elementos","de","una","frase",",","separando","por","oraciones","." +
                "Esto","es","otro","elemento","sobre","el","que","evaluar","el","resultado"};

        /*for (int i = 0; i < frase1.length; i++) {
            int contador = 0;
            contador++;
            contador = frase1.length;
            System.out.println("El numero de palabras es "+contador);
        }*/

        System.out.println("El numero de palabras es " +frase1.length);

        }


    }

