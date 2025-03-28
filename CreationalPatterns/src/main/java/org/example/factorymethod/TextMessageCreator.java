package org.example.factorymethod;


import org.example.factorymethod.message.Message;
import org.example.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
