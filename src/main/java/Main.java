import com.tlee753.stockMarket.Messenger;
import com.tlee753.stockMarket.User;
import com.tlee753.userInterface.Mailer;


public class Main {
    public static void main(String[] args) {
        // create user
        // update their stocks
        User tyler = new User("tyler");
        User brandon = new User("brandon");

        // formulate message
        Messenger bMessenger = new Messenger(brandon);
        bMessenger.generateMessage("all");
        Messenger tMessenger = new Messenger(tyler);
        tMessenger.generateMessage("all");

        // send message
        Mailer myMailer = new Mailer();
        myMailer.sendMessage(tyler.getAddress(), tyler.getFullName() + " Shares", tMessenger.getMessage());
        // myMailer.sendMessage(brandon.getAddress(), brandon.getFullName() + " Shares", bMessenger.getMessage());
    }
}

/*
* xTODO make a string building class (desired stock info)
* xTODO move elements to separate methods
* TODO allow for command line arguments to be passed in for server side ease of use
* TODO create a user object with stocks and how to contact them
* TODO two way capability
* TODO other features
* - sports scores
* - map directions
* - messages (FB,etc)
* -
*/