package mediator;

public abstract class Citizen {
    protected String name;
    protected PostOffice postOffice;
    public Citizen(String name, PostOffice postOffice){
        this.name = name;
        this.postOffice = postOffice;
    }

    public String getName(){
        return name;
    }
    public abstract void receive(String _package, String from);
    public void send(String message, String to) {
        System.out.println(this.name + " is mailing a package to " + to);
        postOffice.dispatch(message, to, this.name);
    }
}
