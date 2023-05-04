package lab_5.implementation;

public class ReadMessageState implements MessageState {
    @Override
    public void read() {
        // already read
    }

    @Override
    public boolean isRead() {
        return true;
    }
}
