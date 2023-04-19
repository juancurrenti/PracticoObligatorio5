
package practicoobligatorio5;

public class PruebaArreglo {

    public static void main(String[] args) {
        // Ejemplo de uso del método sumarLista
        int[] lista = {2, 4, 6, 8, 10};
        Arreglo.sumarLista(lista);
        
        // Ejemplo de uso del método buscarMayor
        int[][] arreglo = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int mayor = Arreglo.buscarMayor(arreglo);
        System.out.println("El entero más grande es: " + mayor);
        
        // Ejemplo de uso del método cuentaVocales
        String cadena = "Hola mundo!";
        int cuentaVocales = Arreglo.cuentaVocales(cadena);
        System.out.println("La cantidad de vocales es: " + cuentaVocales);
        
        // Ejemplo de uso del método cuentaCaracter
        String cadena2 = "abracadabra";
        char caracter = 'a';
        int cuentaCaracter = Arreglo.cuentaCaracter(cadena2, caracter);
        System.out.println("La cantidad de veces que se repite el caracter " + caracter + " en la cadena es: " + cuentaCaracter);
    }
    
}
