public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Object gender, int numberOfShows) {
        super(name, surname, gender.toString(), 0);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows(){
        return numberOfShows;
    }

    @Override
    public String toString(){
        return getFullName()+" - поставил спектаклей: "+numberOfShows;
    }
}