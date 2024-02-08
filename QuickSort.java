/** Algoritmos y Estructuras de datos -  seccion 30
 * Luis Francisco Padilla Juárez - 23663
 * Gabrein Bran Bolaños - 23590
 * HT3, Sorts
 * 07-02-2024
 * @return QuickSort
 */

public class QuickSort <T extends Comparable<T>>{

    public T[] sort(T[] arr) {
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        return arr;
    }
    
    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int a = partition(arr, low, high);

            quickSort(arr, low, a - 1);
            quickSort(arr, a + 1, high);
        }
    }

    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;

        return i + 1;
    }

}