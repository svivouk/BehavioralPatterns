package memento;

public class Plant {
    private Season season;

    public void setSeason(Season season) {
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }

    public Memento save() {
        return new Memento(this.season);
    }

    public void restore(Memento memento) {
        this.season = memento.savedSeason;
    }

    public static class Memento {
        private final Season savedSeason;

        private Memento(Season season) {
            this.savedSeason = season;
        }

    }
}