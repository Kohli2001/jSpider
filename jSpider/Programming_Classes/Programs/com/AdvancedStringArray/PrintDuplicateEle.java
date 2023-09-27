package advancedArrayString;

public class PrintDuplicateEle {
    
    static void printDuplicateElements(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] temp = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++; // Increment the count for this element
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                System.out.println(i); // Print the element if it's a duplicate
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 5, 1, 7 };
        printDuplicateElements(arr);
    }
}

