import java.util.Scanner;

public class KISS {
    public String invertirCadena(String cadena){
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = scanner.nextLine();

        KISS main = new KISS();
        System.out.println("La palabra " + cadena + " invertida sería: " + main.invertirCadena(cadena));
    }
}
