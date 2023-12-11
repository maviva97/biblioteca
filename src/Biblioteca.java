import java.util.List;

public class Biblioteca <T>{
    List<LibraryItems> items;
    public void addItem(LibraryItems t){
        items.add(t);
    }
}
