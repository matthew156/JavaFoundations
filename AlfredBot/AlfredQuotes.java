import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello" + name +" Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") != -1) {
        return "Right away, sir. She certainly isn't sophisticated enough for that";
        } else if(conversation.indexOf("Alfred") != -1){
            return "Right away sir!";
        }
        else{
            return "Right. And with that I shall retire.";
        }

    }
    
}

