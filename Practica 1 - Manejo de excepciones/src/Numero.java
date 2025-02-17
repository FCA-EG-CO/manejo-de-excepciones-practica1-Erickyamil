public class Numero {
    private int num;

    public Numero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static void compruebaNumPar(int num) throws numeroImparException {
        if (num % 2 != 0) {
            throw new numeroImparException("Error: El número es impar");
        } else {
            System.out.println("El número es par");
        }
    }
}