import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<>();
        ArrayList<Director> directors = new ArrayList<>();

        // Создаем актеров с использованием enum Gender
        Actor actor1 = new Actor("Анастасия", "Громова", Gender.FEMALE.toString(), 1.69);
        Actor actor2 = new Actor("Кирилл", "Михайлов", Gender.MALE.toString(), 1.80);
        Actor actor3 = new Actor("Елена", "Новикова", Gender.FEMALE.toString(), 1.59);

        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);

        // Создаем режиссеров с использованием enum Gender
        Director director1 = new Director("Елизар", "Коновалов", Gender.MALE.toString(), 92);
        Director director2 = new Director("Василий", "Бабушкин", Gender.MALE.toString(), 172);

        directors.add(director1);
        directors.add(director2);

        // Создаем составы актеров для спектаклей (исправил имена переменных)
        ArrayList<Actor> regularShowCast = new ArrayList<>();
        regularShowCast.add(actor1);
        regularShowCast.add(actor2);

        ArrayList<Actor> operaCast = new ArrayList<>();
        operaCast.add(actor1);
        operaCast.add(actor2);

        ArrayList<Actor> balletCast = new ArrayList<>();
        balletCast.add(actor2);
        balletCast.add(actor3);

        // СОЗДАЕМ ТРИ СПЕКТАКЛЯ:

        // 1. Обычный спектакль
        Show regularShow = new Show("Кому на Руси жить хорошо", "Некрасов", "Николай", regularShowCast, 150);

        // 2. Оперный спектакль
        Opera opera = new Opera("Евгений Онегин", "Станиславский", "Константин",
                operaCast, 180, "Пётр Чайковский",
                "Либретто оперы 'Евгений Онегин'", 40);

        // 3. Балетный спектакль
        Ballet ballet = new Ballet("Лебединое озеро", "Петипа", "Мариус",
                balletCast, 140, "Пётр Чайковский",
                "Либретто балета 'Лебединое озеро'",
                "Мариус Петипа", 25);

        // ДЕМОНСТРАЦИЯ РАБОТЫ:

        System.out.println("\n1. ОБЫЧНЫЙ СПЕКТАКЛЬ:");
        regularShow.printAllActors();

        System.out.println("\n2. ОПЕРНЫЙ СПЕКТАКЛЬ:");
        opera.printAllActors();
        opera.printLibretto();

        System.out.println("\n3. БАЛЕТНЫЙ СПЕКТАКЛЬ:");
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