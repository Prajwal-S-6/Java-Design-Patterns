package org.example.memento.command;


import org.example.memento.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand {

    private String name;

    public CreateCommand(WorkflowDesigner designer, String name) {
        super(designer);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = receiver.createMemento();
        receiver.createWorkflow(name);
    }

}
