import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private String choreographer;
    private int dancersCount;

    public Ballet(String title, String directorLastName, String directorName,
                  ArrayList<Actor> listOfActors, int duration,
                  String musicAuthor, String librettoText,
                  String choreographer, int dancersCount) {
        super(title, directorLastName, directorName, listOfActors, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
        this.dancersCount = dancersCount;
    }
}