import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, String directorLastName, String directorName,
                 ArrayList<Actor> listOfActors, int duration,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, directorLastName, directorName, listOfActors, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}