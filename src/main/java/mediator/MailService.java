package mediator;

import java.util.HashMap;
import java.util.Map;

public class MailService implements PostOffice{
    private final Map<String, Citizen> citizens = new HashMap<>();

    @Override
    public void dispatch(String _package, String recipientName, String from) {
        if (citizens.containsKey(recipientName)) {
            Citizen recipient = citizens.get(recipientName);
            recipient.receive(_package, from);
        }
        else{
            System.out.println("Post Office: Return to sender. Address not found for " + recipientName);
        }
    }

    @Override
    public void registerCitizen(Citizen citizen) {
        citizens.put(citizen.getName(), citizen);
    }
}
