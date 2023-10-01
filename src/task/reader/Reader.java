package task.reader;

import java.awt.print.Book;

import java.util.Date;

public class Reader {
    public String fullName;
    public String libraryCard;
    public String faculty;
    public String  birthDate;
    public String phoneNumber;

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

    static class Book{
        public String name;
        public String author;

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
}
