package org.example.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
