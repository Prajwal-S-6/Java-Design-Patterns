package org.example.factorymethod;


import org.example.factorymethod.message.JSONMessage;
import org.example.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
