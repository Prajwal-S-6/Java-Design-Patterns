package org.example.factorymethod;


import org.example.factorymethod.message.Message;
import org.example.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 * Subclass will provide the implementation for objects
 * if new type is added then new subclass creator will create objects for it
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
