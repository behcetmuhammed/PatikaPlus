package Week2;

public class transposeOfMatrix {

    public static void transposeMatris(int[][] arr, int[][] arrT){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arrT [j][i] = arr[i][j]; //satır ve sütunları yer değiştiriyoruz..
            }
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{2, 3, 4}, {5, 6, 4}};

        int[][] arrT1 = new int[arr1[0].length][arr1.length]; //Ters yazdık çünkü Transpoz alırken i ve j ler yer değiştirir. Yani 2x3 lük matris 3x2 lik matris döner...
        int[][] arrT2 = new int[arr2[0].length][arr2.length]; //Ters yazdık çünkü Transpoz alırken i ve j ler yer değiştirir. Yani 2x3 lük matris 3x2 lik matris döner...

        printArr(arr1);
        System.out.println("===========");
        transposeMatris(arr1, arrT1);
        printArr(arrT1);

        System.out.println("xxxxxxxxxxxxxxxxxx");
        printArr(arr2);
        System.out.println("===========");
        transposeMatris(arr2, arrT2);
        printArr(arrT2);
    }
}
