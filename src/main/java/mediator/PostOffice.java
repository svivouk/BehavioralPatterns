package mediator;

public interface PostOffice {
    void dispatch(String _package, String recipientName, String from);
    void registerCitizen(Citizen citizen);
}
