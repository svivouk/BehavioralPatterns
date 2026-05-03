import chainofresponsibility.*;
import command.*;
import iterator.BookShelf;
import iterator.BookShelfIterator;
import iterator.Iterator;

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


    //=======================Command===========================
    System.out.println();
    Checkbox checkbox = new Checkbox();
    Command comCheck = new CheckboxCommand(checkbox);
    Switch _switch = new Switch();
    Command switchCommand = new SwitchCommand(_switch);
    Invoker invoker = new Invoker(comCheck);
    invoker.invoke();
    invoker.invoke();
    invoker.setCommand(switchCommand);
    invoker.invoke();
    invoker.invoke();
    //====================Command ends==========================


    //========================Iterator==========================
    System.out.println();
    BookShelf bookShelf = new BookShelf();
    bookShelf.addBook("Book1");
    bookShelf.addBook("Book2");
    bookShelf.addBook("Book3");
    bookShelf.addBook("Book4");

    Iterator<String> iterable = bookShelf.createIterator();
    System.out.println("Get Books: ");
    while (iterable.hasNext()) {
        System.out.println(" Book on shelf: " + iterable.next());
    }
    //=====================Iterator ends========================
}