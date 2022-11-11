public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();
        Printtable[] printtables = {book, magazine};

        for (int i = 0; printtables.length > i; i++) {
            printtables[i].print();

        }

    }
}
