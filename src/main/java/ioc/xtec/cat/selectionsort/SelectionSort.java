package ioc.xtec.cat.selectionsort;
/**
 * Classe que implementa l'algorisme d'ordenació Selection Sort i 
 * proporciona funcionalitat per buscar valors dins d'un array.
 * 
 * @author Juan A. Bejarano Vizuete
 * @version 1.0
 */
public class SelectionSort {
/**
     * Ordena un array d'enters utilitzant l'algorisme Selection Sort.
     *
     * @param arr L'array a ordenar.
     */
   public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercanvi de valors
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
/**
     * Comprova si un valor específic existeix dins d'un array.
     *
     * @param arr   L'array on es busca el valor.
     * @param value El valor a buscar dins de l'array.
     * @return True si el valor existeix a l'array; false en cas contrari.
     * @throws IllegalArgumentException si l'array és nul.
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
