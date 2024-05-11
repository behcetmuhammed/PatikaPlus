package Week2;
/*
    Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

    ## Senaryo
    Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
    Tekrar Sayıları
    10 sayısı 3 kere tekrar edildi.
    20 sayısı 4 kere tekrar edildi.
    5 sayısı 1 kere tekrar edildi.

 */
public class FrequencyCounter {

    public static void ArrFrequencyCounter(int[] arr) {
        //{10, 20, 20, 10, 10, 20, 5, 20}

        int[] frequencies = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (frequencies[i] == -1) continue; //daha önce konrtol ettiğimiz bi değer varsa onu atla dedik...

            int tekrarSayisi = 1;

            //{10, 20, 20, 10, 10, 20, 5, 20}
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    tekrarSayisi++;
                    frequencies[j] = -1; //tekrlanan sayıyı -1 yaptık..
                }
            }

            // Frekansı ekrana yazdırıyoruz
            if (tekrarSayisi > 0) {
                System.out.println(arr[i] + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
            }
        }
    }


    ////////////////     ANA METOD    ////////////////
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 10, 10, 20, 5, 20};

        ArrFrequencyCounter(arr);
    }
}
