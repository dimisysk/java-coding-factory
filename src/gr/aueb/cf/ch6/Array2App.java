package gr.aueb.cf.ch6;

/**
 * unsized initialization
 */
public class Array2App {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for ( int num : arr ) {
            System.out.print(num + " ");
        }
    }
}
