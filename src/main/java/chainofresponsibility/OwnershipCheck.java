package chainofresponsibility;

public class OwnershipCheck implements Handler{

    @Override
    public void setNext(Handler next) {

    }

    @Override
    public void handle(User user) throws Exception {
        if(!user.currentUserId().equals(user.resourceOwnerId())){
            throw new Exception("You do not own this resource.");
        }

        System.out.println("Access granted.");

    }
}
