package Week5.BookSorter;

import java.util.Comparator;
//Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.

public class Book implements Comparable<Book> {
    private String nameBook; // kitap adı
    private String nameWriter; // Yazar adı
    private int numPage; // Sayfa sayısı
    private int releaseDate; // Yayın tarihi

    public Book(String nameBook, String nameWriter, int numPage, int releaseDate) {
        this.nameBook = nameBook;
        this.nameWriter = nameWriter;
        this.numPage = numPage;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.nameBook.compareTo(other.nameBook);
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameWriter() {
        return nameWriter;
    }

    public void setNameWriter(String nameWriter) {
        this.nameWriter = nameWriter;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
