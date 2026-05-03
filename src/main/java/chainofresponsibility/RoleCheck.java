package chainofresponsibility;

public class RoleCheck implements Handler{
    private Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(User user) throws Exception {
        if(!user.userRole().equals("ADMIN")){
            if (next != null) {
                System.out.println("Next OwnershipCheck");

                next.handle(user);
            }
            else throw new Exception("Admin Mode");
        }
    }
}
