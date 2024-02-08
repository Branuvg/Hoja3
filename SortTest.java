import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    @Test
    public void testGnome() {

        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        Integer[] arr = {5, 3, 8, 2, 7, 1};
        Integer[] expected = {1, 2, 3, 5, 7, 8};

        gnomeSort.sort(arr);

        assertArrayEquals(expected, arr);
    }


    @Test
    public void testMerge() {

        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] arr = {5, 3, 8, 2, 7, 1};
        Integer[] expected = {1, 2, 3, 5, 7, 8};

        Integer[] result = mergeSort.sort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testQuick() {

        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] arr = {5, 3, 8, 2, 7, 1};
        Integer[] expected = {1, 2, 3, 5, 7, 8};

        Integer[] result = quickSort.sort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testRadix() {

        RadixSort<Integer> radixSort = new RadixSort<>();
        Integer[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        Integer[] expected = {2, 24, 45, 66, 75, 90, 170, 802};

        Integer[] result = radixSort.sort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testBubble() {
        // Arrange
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {5, 3, 8, 2, 7, 1};
        Integer[] expected = {1, 2, 3, 5, 7, 8};

        // Act
        bubbleSort.sort(arr, arr.length);

        // Assert
        assertArrayEquals(expected, arr);
    }

}
