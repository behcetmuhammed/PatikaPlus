package Week2.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr1 = {15, 45, 28, 96, 36, 14, 5, 1, 73, 65};
        int[] arr2 = {15, 45, 28, 96, 36, 14, 5, 1, 73, 65};
        int[] arr3 = {25, 5, 8, 91, 52, 89, 33, 29, 25, 15};

        //HalperArrays.fill(arr1, 10);
        //HalperArrays.printArrays(arr1);
        //System.out.println(HalperArrays.isEqual(arr1, arr3));
        //HalperArrays.binarySearch(arr1, 65);
        //HalperArrays.sort(arr1);
        //HalperArrays.printArrays(arr1);
        //HalperArrays.fill(arr1, 10, 2, 5);
        //HalperArrays.printArrays(arr1);
        //HalperArrays.copyOf(arr1, arr3);
        System.out.println("--------------");
        //HalperArrays.printArrays(arr1); //arr3 ü arr1'e atadık.
        //HalperArrays.printArrays(arr3);

        System.out.println("Dizi arr1:");
        HalperArrays.printArrays(arr1);
        System.out.println("Dizi arr3:");
        HalperArrays.printArrays(arr3);
        System.out.println("\n");
        HalperArrays.copyOfRange(arr1, arr3, 2, 5);
        HalperArrays.printArrays(arr1);
    }
}
