package chainofresponsibility;

public class AuthenticationCheck implements Handler{
    private Handler next;

    @Override
    public void handle(User user){
        if(!user.isAuthenticated()){
            System.out.println("User must be logged in");
            return;
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
