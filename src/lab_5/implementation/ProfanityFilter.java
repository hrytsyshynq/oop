package lab_5.implementation;

public class ProfanityFilter implements MessageHandler {
    private static final String[] BAD_WORDS = {"bad", "words", "go", "here"};

    private MessageHandler nextHandler;

    @Override
    public void setNext(MessageHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public boolean processMessage(Message message) {
        for (String word : BAD_WORDS) {
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
