package chainofresponsibility;

public class OwnershipCheck implements Handler{

    @Override
    public void setNext(Handler next) {

    }

    @Override
    public void handle(User user){
        if(!user.currentUserId().equals(user.resourceOwnerId())){
            System.out.println("You do not own this resource.");
            return;
        }

        System.out.println("Access granted.");

    }
}
