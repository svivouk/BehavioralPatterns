package mediator;
public class Resident extends Citizen {
    public Resident(String name, PostOffice postOffice) {
        super(name, postOffice);
    }

    @Override
    public void receive(String message, String from) {
        System.out.println(this.name + " received mail: '" + message + "'");
    }
}