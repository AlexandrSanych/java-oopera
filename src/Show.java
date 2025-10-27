import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected ArrayList<Actor> listOfActors;
    protected Director director;

    public Show(String title, Director director, int duration) {
        this.director = director;
        this.title = title;
        this.listOfActors = new ArrayList<>();
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public boolean addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getFullName() + " уже есть в спектакле!");
            return false;
        }
        listOfActors.add(actor);
        System.out.println("Актёр " + actor.toString() + " добавлен в спектакль \"" + title + "\"");
        return true;
    }

    public void printDirectorInfo() {
        System.out.println("Режисёр: " + director.toString());
    }

    public void printAllActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список пуст!");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor.toString());
            }
        }
    }

    public void replaceTheActor(Actor newActor, String surNameReplace) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surNameReplace)) {
                if (listOfActors.get(i).equals(newActor)) {
                    System.out.println("Актёр " + newActor.getFullName() + " уже играет эту роль!");
                    found = true;
                    break;
                }

                if (listOfActors.contains(newActor)) {
                    System.out.println("Актёр " + newActor.getFullName() + " уже есть в спектакле! Замена невозможна.");
                    found = true;
                    break;
                }

                Actor oldActor = listOfActors.get(i);
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + oldActor.toString() + " заменён на " + newActor.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией '" + surNameReplace + "' не найден!");
        }
    }
}