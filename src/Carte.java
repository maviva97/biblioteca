public class Carte extends LibraryItems{

    public Carte(String title, String author) {
        super(title, author);
    }

    @Override
    public String toString() {
        return "Carte{} " + super.toString();
    }
}
