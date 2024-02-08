import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BubbleSort<Fraction> manager1 = new BubbleSort<Fraction>();
        QuickSort<Fraction> manager2 = new QuickSort<Fraction>();

        MergeSort<Fraction> manager3 = new MergeSort<Fraction>();
        GnomeSort<Fraction> manager4 = new GnomeSort<Fraction>();
        RadixSort<Fraction> manager5 = new RadixSort<Fraction>();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Presiona cualquier tecla para continuar");
        String tmp = rd.readLine();

        for(int N = 1; N < 3000; N++){
            Fraction arr[] = new Fraction[N];

            for(int i = 0; i < N; i++){
                arr[i] = new Fraction(i+2,i+1);
            }
            manager1.sort(arr,N);
            manager2.sort(arr);
            manager3.sort(arr);
            manager4.sort(arr);
            manager5.sort(arr);
        }
        System.out.println("Termino programa");
    }
}