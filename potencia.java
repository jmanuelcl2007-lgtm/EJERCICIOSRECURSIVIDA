package EjerciciosDeRecursividad;

public class potencia {
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        int base = 8;
        int exponente = 2;
        System.out.println(base + " elevado a la " + exponente + " es: " + potencia(base, exponente));
    }
}