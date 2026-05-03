package chainofresponsibility;

public interface Handler {
    void handle(User user) throws Exception;
    void setNext(Handler next);
}
