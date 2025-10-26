import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected ArrayList<Actor> listOfActors;
    protected String directorName;
    protected String directorLastName;

    public Show(String title, String directorLastName, String directorName,
                ArrayList<Actor> listOfActors, int duration) {
        this.title = title;
        this.directorLastName = directorLastName;
        this.directorName = directorName;
        this.listOfActors = listOfActors != null ? listOfActors : new ArrayList<>();
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void printAllActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список пуст!");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor.getSurname() + " " + actor.getName() + " " + actor.getHeight() + " м.");
            }
        }
    }

    public void replaceTheActor(Actor newActor, String surNameReplase) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surNameReplase)) {
                if (listOfActors.get(i).equals(newActor)) {
                    System.out.println("Актёр " + newActor.getFullName() + " уже играет эту роль!");
                    found = true;
                    break;
                }

                Actor oldActor = listOfActors.get(i);
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + oldActor.getFullName() + " заменён на " + newActor.getFullName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией '" + surNameReplase + "' не найден!");
        }
    }
}