package lab_5.implementation;

public class SpamFilter implements MessageHandler {
    private static final String[] SPAM_WORDS = {"spam", "go", "here"};

    private MessageHandler nextHandler;

    @Override
    public void setNext(MessageHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public boolean processMessage(Message message) {
        for (String word : SPAM_WORDS) {
            if (message.getText().contains(word)) {
                message.setState(new UnreadMessageState());
                return false; // повідомлення не проходить перевірку
            }
        }
        if (nextHandler != null) {
            message.setState(new ReadMessageState());
            return nextHandler.processMessage(message);
        }
        return true; // повідомлення проходить перевірку
    }
}
