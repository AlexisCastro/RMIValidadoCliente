
import java.util.Scanner;

public class RMIClientMain {

    public static void main(String[] args) {
        int num1, num2;
        boolean confirmar = true;
        Scanner sc = new Scanner(System.in);
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();
            while (confirmar = true) {
                System.out.println("Da el numero 1");
                num1 = sc.nextInt();
                System.out.println("Da el numero 2");
                num2 = sc.nextInt();

                if (num1 != 0) {
                    if (num2 != 0) {
                        System.out.println(" resultado de la suma por el servidor: " + wsc.getSuma(num1, num2));
                        System.out.println(" resultado de la resta por el servidor: " + wsc.getResta(num1, num2));
                        System.out.println(" resultado de la multiplicacion por el servidor: " + wsc.getMultiplicacion(num1, num2));
                        System.out.println(" resultado de la division por el servidor: " + wsc.getDivision(num1, num2));
                        System.out.println(" resultado de la potencia por el servidor: " + wsc.getPotencia(num1, num2));
                        System.out.println(" resultado de la area por el servidor: " + wsc.getAreaTriangulo(num1, num2));
                        confirmar = false;
                    } else {
                        System.out.println("Por favor da los datos otra vez;");
                        System.out.println("Estos deben ser diferentes de cero");
                    }
                } else {
                    System.out.println("Por favor da los datos otra vez;");
                    System.out.println("Estos deben ser diferentes de cero");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Connection error the server is not responding.");
        }
    }
}
