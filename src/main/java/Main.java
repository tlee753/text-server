import com.tlee753.stockMarket.Messenger;
import com.tlee753.stockMarket.User;
import com.tlee753.userInterface.Mailer;


public class Main {
    public static void main(String[] args) {
        // create user
        User tyler = new User("tyler");

        Messenger myMessenger = new Messenger(tyler);
        myMessenger.generateMessage("all");
        // update their stocks
        // formulate message

        // send message
        Mailer myMailer = new Mailer();
        myMailer.sendMessage(tyler.getAddress(), tyler.getFullName() + " Shares", myMessenger.getMessage());
        // myMailer.sendMessage(tyler.getAddress(), myMessenger.getMessage());
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