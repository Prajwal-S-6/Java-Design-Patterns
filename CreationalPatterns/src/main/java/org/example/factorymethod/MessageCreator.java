package org.example.factorymethod;


import org.example.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    private Message message;

    public Message getMessage() {
        this.message = createMessage();
        return this.message;
    }

	public abstract Message createMessage();
}
