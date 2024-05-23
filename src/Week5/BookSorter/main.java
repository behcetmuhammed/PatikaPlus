package Week5.BookSorter;

import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

/*
    Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
    Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.

    Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.

    Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.

    Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
 */
public class main {
    public static void main(String[] args) {

        Book b1 = new Book("Hayat", "hay", 100, 2000);
        Book b2 = new Book("Yaşam", "yaş", 140, 2004);
        Book b3 = new Book("Cennet", "cen", 90, 1996);
        Book b4 = new Book("Sevgi", "sev", 60, 2010);
        Book b5 = new Book("Dünya", "dün", 210, 2021);

        Set<Book> tSet = new TreeSet<>();

        tSet.add(b1);
        tSet.add(b2);
        tSet.add(b3);
        tSet.add(b4);
        tSet.add(b5);

        // Kitapları sayfa sayısına göre sıralamak...
        Set<Book> sortBookByPage = new TreeSet<>(Comparator.comparingInt(Book::getNumPage));
        sortBookByPage.addAll(tSet);

        for (Book book: sortBookByPage) {
            System.out.println(book.getNameBook());
        }

    }
}
