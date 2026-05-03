package chainofresponsibility;

public interface Handler {
    void handle(User user);
    void setNext(Handler next);
}
