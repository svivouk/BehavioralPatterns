import chainofresponsibility.*;

void main() {
    //=================Chain of Responsibility================
    Handler auth = new AuthenticationCheck();
    Handler roles = new RoleCheck();
    Handler ownership = new OwnershipCheck();

    auth.setNext(roles);
    roles.setNext(ownership);

    User user1 = new User("USER", true, "user", "user1");
    User user2 = new User("ADMIN", true, "12", "456");
    User user3 = new User("USER", true, "user", "user");

    List<User> users = Arrays.asList(user1, user2, user3);
    users.forEach(user ->{
        try{
            auth.handle(user);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    });
    //===============Chain of Responsibility ends=============
}