package lab_5.implementation;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MessageIterator implements Iterator<Message> {
    private List<Message> messages;
    private int currentIndex = 0;

    public MessageIterator(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < messages.size();
    }

    @Override
    public Message next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Message message = messages.get(currentIndex);
        currentIndex++;
        return message;
    }
}