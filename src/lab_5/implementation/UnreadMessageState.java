package lab_5.implementation;

class UnreadMessageState implements MessageState {
    private boolean read = false;

    @Override
    public void read() {
        read = true;
    }

    @Override
    public boolean isRead() {
        return read;
    }
}
