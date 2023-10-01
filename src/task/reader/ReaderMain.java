package task.reader;

public class ReaderMain {
    public void main(String[] args){
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Пушкин А.А.", "0001", "Юридический", "11.01.1911", "+381112223344");
        readers[1] = new Reader("Чайковский Б.Б.", "0002", "Экономический", "22.02.2002", "+382223334455");
        readers[2] = new Reader("Шевченко В.В.", "0003", "Философский", "03.03.1933", "+383334445566");

        readers[0].takeBook(2);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].takeBook(new Reader.Book("Красное вино", "Коля"), new Reader.Book("Рыбалка", "Дед"));

        readers[0].returnBook(1);
        readers[1].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].returnBook(new Reader.Book("Красное вино", "Коля"), new Reader.Book("Рыбалка", "Дед"));
    }
}
