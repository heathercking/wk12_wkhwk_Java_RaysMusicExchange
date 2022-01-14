package composer;

import products.SheetMusic;

import java.util.ArrayList;

public class Composer {

    private String name;
    private String genre;
    private ArrayList<SheetMusic> compositions;

    public Composer(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.compositions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<SheetMusic> getCompositions() {
        return compositions;
    }

    public int compositionsCount() {
        return this.compositions.size();
    }

    public void addComposition(SheetMusic composition) {
        this.compositions.add(composition);
    }

    public void removeComposition(SheetMusic composition) {
        this.compositions.remove(composition);
    }
}
