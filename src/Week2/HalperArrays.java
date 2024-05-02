package Week2;

public class HalperArrays {

    // Dizi elemanlarını erkana yazdır (Arrays.toString())
    public static void printArrays(int[] arr) {
        System.out.print("Dizi elemanları: [");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    // Dizi elemanlarını değiştir (Arrays.fill())
    public static void fill(int[] arr, int newValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newValue;
        }
    }

    // Dizi elemanlarını değiştir (Arrays.fill()) //range li hali
    public static void fill(int[] arr, int newValue, int range1, int range2) {
        for (int i = range1; i < range2; i++) {
            arr[i] = newValue;
        }
    }

    // Dizi elemanlarını sırala (Arrays.sort())
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Dizi elemanları arasında değrer arama (Arrays.binarySearch())
    public static void binarySearch(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                System.out.println("Aranan index: " + i);
            }
        }
    }

    // Dizi yi kopyalama (Arrays.copyOf()
    public static void copyOf(int[] arr, int[] arrCopy) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrCopy[i];
        }
    }


    // ve Arrays.copyOfRange())
    public static void copyOfRange(int[] arr, int[] arrCopy, int range1, int range2) {
        for (int i = range1; i < range2; i++) {
            arr[i] = arrCopy[i];
        }
    }


    // Dizi eşit mi diye kontrol etme (Arrays.equals())
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                return true;
            }
        }
        return false;
    }

}
