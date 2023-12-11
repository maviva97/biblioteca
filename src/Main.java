import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carte carte1=new Carte("Mihai","Luceafarul");
Ziar ziar1=new Ziar("Mihai","Luceafarul");
Video video1=new Video("Eminescu","Lucefarul");
        Biblioteca<Carte> carteBibilioteca = new Biblioteca<>(new ArrayList<>());
        carteBibilioteca.addItem(carte1);

        Biblioteca<Ziar> ziarBiblioteca = new Biblioteca<>(new ArrayList<>());
        ziarBiblioteca.addItem(ziar1);

        Biblioteca<Video> videoBiblioteca = new Biblioteca<>(new ArrayList<>());
        videoBiblioteca.addItem(video1);
        System.out.println(video1);

//        Biblioteca bibilioteca = new Biblioteca();
//        bibilioteca.addItem(new Carte("Eminescu","Lucefarul"));
//        bibilioteca.addItem(new Ziar("Mihai","Luceafarul"));
//        bibilioteca.addItem(new Video("Eminescu","Lucefarul"));
//        System.out.println(videoBiblioteca);

    }
}