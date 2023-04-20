package task.reader;

import java.awt.print.Book;

import java.util.Date;

public class Reader {
    private String fullName;
    private String libraryCard;
    private String faculty;
    private String  birthDate;
    private String phoneNumber;

    public Reader(String fullName, String libraryCard, String faculty, String birthDate, String phoneNumber){
        this.fullName = fullName;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int x){
        System.out.println(fullName + " взял " + x + "книги.\n");
    }

    public void takeBook(String... bookNames){
        System.out.println(fullName + " взял книги: " + String.join(", ", bookNames) + "\n");
    }

    public void takeBook(Book... books){
        String[] bookNames = new String[books.length];
        for(int i=0; i< books.length; i++){
            bookNames[i] = books[i].getName() + " (" + books[i].getAuthor() + ")";
        }
        System.out.println(fullName + " взял книги: " + String.join(", ", bookNames) + "\n");
    }

    public void returnBook(int y){
        System.out.println(fullName + " взял " + y + "книги.\n");
    }

    public void returnBook(String... bookNames){
        System.out.println(fullName + " вернул книги: " + String.join(", ", bookNames) + "\n");
    }

    public void returnBook(Book... books){
        String[] bookNames = new String[books.length];
        for(int i=0; i<books.length; i++){
            bookNames[i] = books[i].getName() + " (" + books[i].getAuthor() + ")";
        }
        System.out.println(fullName + " вернул книги: " + String.join(", ", bookNames) + "\n");
    }

    class Book{
        private String name;
        private String author;

        public Book(String name, String author){
            this.name = name;
            this.author = author;
        }

        public String getName(){
            return name;
        }

        public String getAuthor(){
            return author;
        }
    }

    public class Main{
        public void main(String[] args){
            Reader[] readers = new Reader[3];
            readers[0] = new Reader("Пушкин А.А.", "0001", "Юридический", "11.01.1911", "+381112223344");
            readers[1] = new Reader("Чайковский Б.Б.", "0002", "Экономический", "22.02.2002", "+382223334455");
            readers[2] = new Reader("Шевченко В.В.", "0003", "Философский", "03.03.1933", "+383334445566");

            readers[0].takeBook(2);
            readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
            readers[2].takeBook(new Book("Красное вино", "Коля"), new Book("Рыбалка", "Дед"));

            readers[0].returnBook(1);
            readers[1].returnBook("Приключения", "Словарь", "Энциклопедия");
            readers[2].returnBook(new Book("Красное вино", "Коля"), new Book("Рыбалка", "Дед"));
        }
    }
}
