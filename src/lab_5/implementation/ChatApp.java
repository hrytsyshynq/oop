package lab_5.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatApp {
    private List<Message> messages;
    private MessageHandler messageHandler;

    public ChatApp() {
        this.messages = new ArrayList<>();
        this.messageHandler = new ProfanityFilter();
        this.messageHandler.setNext(new SpamFilter());
    }

    public void receiveMessage(String text) {
        Message message = new Message(text);
        messages.add(message);
        boolean passed = messageHandler.processMessage(message);
        if (passed) {
            System.out.println("Message received: " + text);
        } else {
            System.out.println("Message blocked: " + text);
        }
    }

    public void readAllMessages() {
        Iterator<Message> iterator = new MessageIterator(messages);
        System.out.println("All messages:");
        while (iterator.hasNext()) {
            Message message = iterator.next();
            if (message.isRead() ) {
                message.read();
                System.out.println("Already read: " + message.getText());
            }
            else {
                System.out.println("Blocked: " + message.getText());
            }
        }
    }
}