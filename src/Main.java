public class Main {
    public static void main(String[] args) {

        Biblioteca<Carte> carteBibilioteca = new Biblioteca<>();
        carteBibilioteca.addItem(new Carte());

        Biblioteca<Ziar> ziarBiblioteca = new Biblioteca<>();
        ziarBiblioteca.addItem(new Ziar());

        Biblioteca<Video> videoBiblioteca = new Biblioteca<>();
        videoBiblioteca.addItem(new Video());

        Biblioteca bibilioteca = new Biblioteca();
        bibilioteca.addItem(new Carte("Eminescu","Lucefarul"));
        bibilioteca.addItem(new Ziar("Mihai","Luceafarul"));
        bibilioteca.addItem(new Video("Eminescu","Lucefarul"));
        System.out.println(videoBiblioteca);

    }
}