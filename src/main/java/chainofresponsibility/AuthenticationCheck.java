package chainofresponsibility;

public class AuthenticationCheck implements Handler{
    private Handler next;

    @Override
    public void handle(User user) throws Exception {
        if(!user.isAuthenticated()){
            throw new Exception("User must be logged in");
        }
        if(next != null) {
            System.out.println("Next RoleCheck");
            next.handle(user);
        }
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}
