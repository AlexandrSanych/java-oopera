import java.util.ArrayList;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, String directorLastName, String directorName,
                       ArrayList<Actor> listOfActors, int duration,
                       String musicAuthor, String librettoText) {
        super(title, directorLastName, directorName, listOfActors, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Метод для печати текста либретто
    public void printLibretto() {
        System.out.println("=== ТЕКСТ ЛИБРЕТТО СПЕКТАКЛЯ \"" + getTitle() + "\" ===");
        System.out.println(librettoText);
        System.out.println("Либретто балета \"Лебединое озеро\"\n" +
                "Композитор: П.И. Чайковский\n" +
                "\n" +
                "АКТ I\n" +
                "Парк перед замком\n" +
                "\n" +
                "Принц Зигфрид празднует свое совершеннолетие.\n" +
                "Веселье, танцы крестьян.\n" +
                "Появление Владетельной принцессы - матери принца.\n" +
                "Она напоминает: завтра на балу он должен выбрать невесту.\n" +
                "\n" +
                "АКТ II\n" +
                "Озеро в лесу. Ночь\n" +
                "\n" +
                "Зигфрид преследует лебедей. Вдруг один из лебедей превращается в девушку - Одетту.\n" +
                "Она рассказывает о проклятии злого волшебника Ротбарта.\n" +
                "Только искренняя любовь может снять чары.\n");
    }
}