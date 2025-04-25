package array;
public class Arraysums {
    public static void main(String[] args) {
        int arr[] = { 11, 12, 13, 14, 15 };
        int narr[] = new int[arr.length * 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            narr[j] = arr[i] / 10;
            j++;
            narr[j] = arr[i] % 10;
            j++;
        }
        for (int i : narr) {
            System.out.print(i);
        }
    }
}