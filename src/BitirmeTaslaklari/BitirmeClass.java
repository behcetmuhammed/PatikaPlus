package BitirmeTaslaklari;
import java.util.*;

public class BitirmeClass {
    int rowNum;
    int colNum;

    BitirmeClass(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
    }

    ///
    public String[][] creatArray(int rowNum, int colNum) {
        String[][] arr = new String[rowNum][colNum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = "-";
            }
        }
        return arr;
    }

    //mayınları diziye yerleştirme
    public String[][] minePlacement(int row, int col){
        String[][] arrMine = new String[rowNum][colNum];
        for (int i = 0; i < arrMine.length; i++) {
            for (int j = 0; j < arrMine[0].length; j++) {
                arrMine[i][j] = "-";
            }
        }

        int minesPlaced = 0;
        int totalMines  = ((row*col)/4); //SENERYO: 3*4=12 => 12/4 = 3 bomba yerleştir
        Random random = new Random();

        while (minesPlaced < totalMines) {
            int a = random.nextInt(row); // 0 ile satır sayısı arasında rastegele bir değer alır.
            int b = random.nextInt(col); // 0 ile sütun sayısı arasında rastegele bir değer alır.

            if (arrMine[a][b].equals("-")) {
                arrMine[a][b] = "*";
                minesPlaced++;
            }
        }

        return arrMine;
    }





    public void indeksBulucu(String[][] arr, int row, int col) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j].equals("*")) {
                    if(i > -1 || j > -1){
                        if(arr[i-1][j].equals("*")){
                            counter++;
                        }
                    }
                }
            }
        }
    }



    // Diziye ekrana yazdırma
    public static void printArr(String[][] arr) {
        //creatArray();
        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }






    ///
    public void run() {

    }

}
