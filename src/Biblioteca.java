import java.util.List;

public class Biblioteca <T>{
    public Biblioteca(List<LibraryItems> items) {
        this.items = items;
    }

    List<LibraryItems> items;
    public void addItem(LibraryItems t){
        items.add(t);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "items=" + items +
                '}';
    }
}
