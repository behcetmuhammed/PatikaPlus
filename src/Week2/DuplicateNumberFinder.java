package Week2;
/*
    Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak
    GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.
 */
public class DuplicateNumberFinder {

    //Kontrol etme
    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    //taşıma
    static int counter = 0;
    public static int transportArr(int[] arr, int[] arrDisk) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    if (!isFind(arrDisk, arr[i])) {
                        //ödev de istenilen kısım...
                        if (arr[i]%2==0) {
                            arrDisk[counter++] = arr[i];
                        }
                    }
                }
            }
        }
        return 1;
    }

    //yazdırma
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //int[] arr = new int[10];
        int[] arr = {2, 5, 4, 4, 5, 8, 2, 6, 1, 10}; //tekrarlanan sayılar 2, 4 ve 5

        int[] arrDisk = new int[arr.length]; //Yeni dizi oluşturduk.. tekrarlanan sayıları buraya yazacağız..

        DuplicateNumberFinder.transportArr(arr, arrDisk);
        DuplicateNumberFinder.printArr(arrDisk);

    }
}
