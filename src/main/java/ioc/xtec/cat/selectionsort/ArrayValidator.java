package ioc.xtec.cat.selectionsort;

/**
 * Classe per validar arrays abans d'operar-hi.
 * S'assegura que l'array no sigui nul ni buit.
 * 
 * @author Juan A.Bejarano Vizuete
 * @version 1.0
 */

public class ArrayValidator {
/**
     * Valida si l'array no és nul ni buit.
     *
     * @param arr L'array a validar.
     * @throws IllegalArgumentException si l'array és nul o buit.
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
    
}
