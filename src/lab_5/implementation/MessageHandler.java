package lab_5.implementation;

public interface MessageHandler {
    void setNext(MessageHandler handler);
    boolean processMessage(Message message);
}