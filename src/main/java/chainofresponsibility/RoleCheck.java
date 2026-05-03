package chainofresponsibility;

public class RoleCheck implements Handler{
    private Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(User user) {
        if(!user.userRole().equals("ADMIN")){
            if (next != null) {
                System.out.println("Next OwnershipCheck");

                next.handle(user);
            }
            System.out.println("Admin Mode");
            return;
        }
    }
}
