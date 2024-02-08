public class GnomeSort  <T extends Comparable<T>> {

    public void sort(T arr[]){
        int i = 1;
        while(i < arr.length){
            if (arr[i].compareTo(arr[i - 1]) >= 0){
                i++;

            }
            else{
                swap(arr,i,i-1);
                if(i>2){
                    i--;
                }
            }
        }
    }
    private void swap(T arr[], int i, int j){
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
