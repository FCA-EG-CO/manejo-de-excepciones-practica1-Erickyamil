import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean bucle = true;

        do {
            try {
                System.out.println("\nIngrese un número entero: ");
                numero = entrada.nextInt(); 
    
                Numero.compruebaNumPar(numero);  // Verifica si el número es par o impar
                bucle = false;
            } catch(InputMismatchException Leny){
                System.out.println("Debe ingresar una número"); 
                entrada.nextLine(); 
            } catch (numeroImparException Leny) {
                System.out.println(Leny.getMessage()); 
            } 
        }while (bucle);
        entrada.close();
    }
}
