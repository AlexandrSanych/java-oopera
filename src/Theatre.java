import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<>();
        ArrayList<Director> directors = new ArrayList<>();


        Actor actor1 = new Actor("Анастасия", "Громова", Gender.FEMALE, 1.69);
        Actor actor2 = new Actor("Кирилл", "Михайлов", Gender.MALE, 1.80);
        Actor actor3 = new Actor("Елена", "Новикова", Gender.FEMALE, 1.59);

        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);

        Director director1 = new Director("Елизар", "Коновалов", Gender.MALE, 92);
        Director director2 = new Director("Василий", "Бабушкин", Gender.MALE, 172);

        directors.add(director1);
        directors.add(director2);

        // СОЗДАЕМ СПЕКТАКЛИ:
        Show regularShow = new Show("Кому на Руси жить хорошо", director1, 150);
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);


        Opera opera = new Opera("Евгений Онегин", director2, 180, "Пётр Чайковский",
                "Либретто оперы 'Евгений Онегин'", 40);
        opera.addActor(actor1);
        opera.addActor(actor2);

        Ballet ballet = new Ballet("Лебединое озеро", director2, 140, "Пётр Чайковский",
                "Либретто балета 'Лебединое озеро'", "Мариус Петипа");
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        // ДЕМОНСТРАЦИЯ РАБОТЫ:
        System.out.println("=== ТЕАТРАЛЬНЫЕ СПЕКТАКЛИ ===");

        System.out.println("\n1. ОБЫЧНЫЙ СПЕКТАКЛЬ:");
        regularShow.printDirectorInfo();
        System.out.println("Актёры:");
        regularShow.printAllActors();

        System.out.println("\n2. ОПЕРНЫЙ СПЕКТАКЛЬ:");
        opera.printDirectorInfo();
        System.out.println("Актёры:");
        opera.printAllActors();
        opera.printLibretto();

        System.out.println("\n3. БАЛЕТНЫЙ СПЕКТАКЛЬ:");
        ballet.printDirectorInfo();
        System.out.println("Актёры:");
        ballet.printAllActors();
        ballet.printLibretto();

        // Заменяем актера
        System.out.println("\nЗамена актера:");
        regularShow.replaceTheActor(actor3, "Громова");
        System.out.println("После замены:");
        regularShow.printAllActors();

        // Пытаемся заменить несуществующего актера
        System.out.println("\nПопытка заменить несуществующего актера:");
        regularShow.replaceTheActor(actor2, "Иванов");
    }
}