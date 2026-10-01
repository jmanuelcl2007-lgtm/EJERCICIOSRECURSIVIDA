package EjerciciosDeRecursividad;

public class StringAlRevez {
    public static String invertirString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + invertirString(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String cadena = "Jose manuel cruz lopez";
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertirString(cadena));
    }

}
