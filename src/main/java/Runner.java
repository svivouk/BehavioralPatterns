import chainofresponsibility.*;
import command.*;
import iterator.BookShelf;
import iterator.Iterator;
import mediator.Citizen;
import mediator.MailService;
import mediator.PostOffice;
import mediator.Resident;
import memento.Plant;
import memento.PlantHistory;
import memento.Season;
import observer.Channel;
import observer.Viewer;
import state.VampireSpecies;
import state.VampireState;
import strategy.ElytraMacing;
import strategy.MaceSpearPvpStrategy;
import strategy.Player;
import strategy.SwordPvPStrategy;
import templatemethod.Admin;
import templatemethod.CreativeServer;
import templatemethod.MainServer;
import templatemethod.MinecraftServer;

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


    //====================Mediator==============================
    System.out.println();

    PostOffice postOffice = new MailService();
    Citizen Kat = new Resident("Kat", postOffice);
    Citizen Alice = new Resident("Alice", postOffice);

    postOffice.registerCitizen(Kat);
    postOffice.registerCitizen(Alice);

    Kat.send("PAck", "Alice");
    Alice.send("Yay", "Kat");
    Alice.receive("Lily", "Kat");
    //====================Mediator ends=========================

    //=======================Memento============================
    System.out.println();

    Plant myPlant = new Plant();
    PlantHistory caretaker = new PlantHistory();

    myPlant.setSeason(Season.SPRING);
    caretaker.push(myPlant.save());
    System.out.println("Current Season: " + myPlant.getSeason());

    myPlant.setSeason(Season.SUMMER);
    caretaker.push(myPlant.save());

    System.out.println("Changed to: " + myPlant.getSeason());

    myPlant.setSeason(Season.WINTER);
    System.out.println("Changed to: " + myPlant.getSeason());

    myPlant.restore(caretaker.pop());
    System.out.println("Restored to: " + myPlant.getSeason());

    myPlant.restore(caretaker.pop());
    System.out.println("Restored to: " + myPlant.getSeason());
    //===================Memento ends============================

    //=========================Observer==========================
    System.out.println();

    Channel Catalog = new Channel();

    Viewer obs1 = new Viewer("user1");
    Viewer obs2 = new Viewer("user2");

    Catalog.subscribe(obs1);
    Catalog.subscribe(obs2);

    Catalog.addVideo("Yay");

    Catalog.unsubscribe(obs1);
    Catalog.addVideo("Yay");

    //====================Observer ends==========================

    //======================State================================
    System.out.println();
    var vampire = new VampireSpecies();
    vampire.Abilities();
    vampire.hiding();
    vampire.hiding();
    vampire.night();
    vampire.hiding();
    //======================State ends===========================

    //========================Strategy===========================
    System.out.println();
    var player = new Player(new SwordPvPStrategy());
    player.duel();
    player.setStrategy(new MaceSpearPvpStrategy());
    player.duel();
    //========================Strategy===========================

    //=====================TemplateMethod========================
    System.out.println();
    var admin = new Admin(new MainServer());
    admin.start();
    System.out.println("----------------------------------------------");
    admin.changeServer(new CreativeServer());
    admin.start();



    //=================TemplateMethod ends=======================
}