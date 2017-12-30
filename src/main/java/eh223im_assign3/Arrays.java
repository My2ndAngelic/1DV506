package eh223im_assign3;

public class Arrays {

    // Check if subarray exists
    public static boolean hasSubsequence(int[] arr, int[] sub) {
        int[] secarr = new int[sub.length];
        boolean com = false;

        if (sub.length < arr.length) { // If smaller, create sub array, compare, move the cursor if fail, stop if extend to the edge
            for (int i = 0;i<arr.length - sub.length+1;i++) {
                for (int j = 0, k=i; j < sub.length; j++,k++) {
                    secarr[j] = arr[k];
                }
                com = true;
                for (int j = 0;j < secarr.length;j++) {
                    if (secarr[j] != sub[j]) {
                        com = false;
                        break;
                    }
                }

                if (com) break;
            }
        } else if (sub.length == arr.length) { // If equal, compare each and every element
            for (int i = 0;i<arr.length;i++) {
                com = true;
                if (arr[i] != sub[i]) {
                    com = false;
                    break;
                }
            }
        } else { // False if length of sub is larger arr
            com = false;
        }

        return com;
    }

    // Sort array
    public static int[] sort(int[] arr) {
        int temp;
        boolean check = false;
        while (!check) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
            check = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    check = false;
                    break;
                }
            }
        }
        return arr;
    }

    // Reverse array
    public static int[] reverse(int[] arr) {
        int[] arrTemp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrTemp[i] = arr[arr.length - i - 1];
        }
        return arrTemp;
    }

    // Replace occurrence
    public static void replaceAll(int[] arr, int old, int nw) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == old) {
                arr[i] = nw;
            }
        }
    }

    // Check if something exists
    public static boolean hasN(int[] arr, int n) {
        boolean check = false;
        for (int anArr : arr) {
            if (n == arr.length) {
                check = true;
                break;
            }
        }
        return check;
    }

    // Convert array to String
    public static StringBuilder toString(int[] arr) {
        StringBuilder str = new StringBuilder("{");
        for (int anArr : arr) { // Get all elements inside
            str.append(anArr).append(",");
        }
        return str = new StringBuilder(str.substring(0, str.length() - 1) + '}');
    }

    // Add a number to all element in array
    public static int[] addN(int[] arr, int n) {
        int[] arrTemp = new int[arr.length];
        for (int i = 0; i < n; i++) {
            arrTemp[i] = arr[i] + n;
        }
        return arrTemp;
    }

    // Sum all element in array
    public static int sum(int[] arr) {
        int k = 0;
        for (int anArr : arr) {
            k += anArr;
        }
        return k;
    }
}
