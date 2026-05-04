package memento;

public enum Season {
    WINTER("Winter"),
    SUMMER("Summer"),
    AUTUMN("Autumn"),
    SPRING("Spring");

    private final String season;

    Season(String season){
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}
