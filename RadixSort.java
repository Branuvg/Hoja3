import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RadixSort <T extends Comparable<T>>{

    public T[] sort(T[] arr) {
        int n = arr.length;
        return radixsort(arr, n);

    }

    private T[] radixsort(T arr[], int n) {
        T mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(mx) > 0) {
                mx = arr[i];
            }
        }

        for (int exp = 1; (int) mx / exp > 0; exp *= 10) {
            ArrayList<T> output = new ArrayList<>(Collections.nCopies(n, null));
            int i;
            int count[] = new int[10];
            Arrays.fill(count, 0);

            for (i = 0; i < n; i++) {
                count[((int) arr[i] / exp) % 10]++;
            }

            for (i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (i = n - 1; i >= 0; i--) {
                output.set(count[((int) arr[i] / exp) % 10] - 1, arr[i]);
                count[((int) arr[i] / exp) % 10]--;
            }

            for (i = 0; i < n; i++) {
                arr[i] = output.get(i);
            }
        }
        return arr;
    }

}
