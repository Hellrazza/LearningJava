import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageList;

    public MessagingService() {
        this.messageList = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContents().length() > 280) {
            return;
        }

        messageList.add(message);
    }

    public ArrayList<Message> getMessageList() {
        return new ArrayList<>(messageList);
    }
}
