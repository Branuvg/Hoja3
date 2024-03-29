/** Algoritmos y Estructuras de datos -  seccion 30
 * Luis Francisco Padilla Juárez - 23663
 * Gabrein Bran Bolaños - 23590
 * HT3, Sorts
 * 07-02-2024
 * @return RadixSort
 */

public class RadixSort<T extends Comparable<T>>{

    public T[] sort(T[] arr) {
        int n = arr.length;
        RadixSort(arr);
        return arr;
    }

    private void RadixSort(T[] a) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    T temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    T temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
    }

    void printArray(T[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
