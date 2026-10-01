package EjerciciosDeRecursividad;

public class SumaDeNumeros {
    public static int sumaInteractiva(int n) {
        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Suma de números del 1 al 10: " + sumaInteractiva(10));
    }


}
