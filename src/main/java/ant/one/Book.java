package ant.one;

public class Book {
    String name;
    String author;
    String genre;
    short publishing;
    int pages;

    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Немецко-русский словарь";
        book.author = "Н.В Глен-Шестакова";
        book.genre = "научная";
        book.publishing = 1980;
        book.pages = 526;
        System.out.println(book.author + ',' + ' ' + book.name + ',' + ' ' + book.genre
                + ',' + ' ' + book.publishing + ' ' + "г." + ',' + ' ' + book.pages + ' ' + "стр.");

        Book book1 = new Book();
        book1.name = "Рассказы";
        book1.author = "Василий Шукшин";
        book1.genre = "проза";
        book1.publishing = 1979;
        book1.pages = 380;
        System.out.println(book1.author + ',' + ' ' + book1.name + ',' + ' ' + book1.genre
                + ',' + ' ' + book1.publishing + ' ' + "г." + ',' + ' ' + book1.pages + ' ' + "стр.");

        Book book2 = new Book();
        book2.name = "Воспитание чувств";
        book2.author = "Гюстав Флобер";
        book2.genre = "роман";
        book2.publishing = 1983;
        book2.pages = 464;
        System.out.println(book2.author + ',' + ' ' + book2.name + ',' + ' ' + book2.genre
                + ',' + ' ' + book2.publishing + ' ' + "г." + ',' + ' ' + book2.pages + ' ' + "стр.");
    }
}
