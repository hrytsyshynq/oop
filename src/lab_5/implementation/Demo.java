package lab_5.implementation;

public class Demo {
    public static void main(String[] args) {
        ChatApp chat = new ChatApp();

        chat.receiveMessage("Hi, how are you?");
        chat.receiveMessage("Can you help me with this?");
        chat.receiveMessage("I have some bad words in this message");
        chat.receiveMessage("This message contains the word spam");
        chat.receiveMessage("This message contains the word maps");

        chat.readAllMessages();
    }
}