import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "nena bella";
        int intenosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinad = false;
        //Arreglos
        char[] lerasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < lerasAdivinadas.length; i++) {
            lerasAdivinadas[i] = '_';
            System.out.print(lerasAdivinadas[i]);
        }
        
        while (!palabraAdivinad && intentos < intenosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(lerasAdivinadas) + " " + palabraSecreta.length() + " letras");
            System.out.println("Introduce una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    lerasAdivinadas[i]=letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto te quedan: "+ (intenosMaximos - intentos) + " intentos");    
            }

            if(String.valueOf(lerasAdivinadas).equals(palabraSecreta)){
                palabraAdivinad = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: "+ palabraSecreta);

            }

        }
        if(!palabraAdivinad){
            System.out.println("Que pena te has quedado sin intentos! GAME OVER");
        }
        scanner.close();

    }
}
