import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] array = {3,5,1,4,90,75,67,23};
        System.out.println(Arrays.toString(mergedSort(array)));
    }
    static int[] mergedSort(int[] array) {
        if(array.length == 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = mergedSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergedSort(Arrays.copyOfRange(array, mid, array.length));

        return mergedArrays(left, right);
    }
    static int[] mergedArrays(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i<first.length && j<second.length) {
            if(first[i] < second[j]) {
                merged[k] = first[i];
                k+=1;
                i+=1;
            } else {
                merged[k] = second[j];
                k+=1;
                j+=1;
            }
        }
        while(i < first.length) {
            merged[k] = first[i];
            k+=1;
            i+=1;
        }
        while(j<second.length) {
            merged[k] = second[j];
            k+=1;
            j+=1;
        }
        return merged;
    }
}
