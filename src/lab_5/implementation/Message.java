package lab_5.implementation;

public class Message {
    private String text;
    private MessageState state;

    public Message(String text) {
        this.text = text;
        this.state = new UnreadMessageState();
    }

    public void read() {
        state.read();
    }

    public boolean isRead() {
        return state.isRead();
    }

    public String getText() {
        return text;
    }

    public MessageState getState() {
        return state;
    }

    public void setState(MessageState state) {
        this.state = state;
    }
}