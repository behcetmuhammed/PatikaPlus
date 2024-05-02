package Week2.LetterPrinting;

public class Main {
    public static void main(String[] args) {
        //Daha büyük bir A yapalım..
        String[][] arr = new String[12][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0 || i == 1 || i == 4 || i == 5 ){
                    arr[i][j] = " *";
                }else if(j == 0 || j == 1 || j == 6 || j == 7 ){
                    arr[i][j] = " *";
                }else{
                    arr[i][j] = "  ";
                }
            }
        }
        //LetterPrint.print(arr);
        //R yapalım..
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0 || i == 1 || i == 4 || i == 5 ){
                    arr[i][j] = " *";
                }else if(j == 0 || j == 1 || j == 6 || j == 7 ){
                    arr[i][j] = " *";
                }else{
                    arr[i][j] = "   ";
                }
            }
        }
        //LetterPrint.print(arr);
        //B yapalım..
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0 || i == 1 || i == 4 || i == 5 || i == 10 || i == 11  ){
                    arr[i][j] = " *";
                }else if(j == 0 || j == 1 || j == 6 || j == 7 ){
                    arr[i][j] = " *";
                }else{
                    arr[i][j] = "   ";
                }
            }
        }
        LetterPrint.print(arr);
    }
}
