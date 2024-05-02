package Week2.LetterPrinting;

public class LetterPrint {

    public static void print(String [][] arr){
        //yazdırmak
        for(String[] row: arr){
            for (String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
