package advancedArrayString;

public class FindUnique {

    static int toFindUnique(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] temp = new int[max + 1];
        for (int ele : arr) {
            temp[ele]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 2, 4, 3, 2, 4 };
        System.out.println(toFindUnique(arr));
    }
}
