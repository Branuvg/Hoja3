public class BubbleSort <T extends Comparable<T>> {

    public void sort(T arr[], int n){
        for(int M = n-1; M > 0; M--){
            bubbleUp(arr,M);
        }
    }

    private void bubbleUp(T arr[], int M){
        for(int j= 0; j < M; j++){
            if (arr[j].compareTo(arr[j+1]) > 0){
                swap(arr, j, j+1);
            }
        }
    }

    private void swap(T arr[], int i, int j){
        T tmp = arr[i];
    }
}
