package org.example.memento;



import org.example.memento.command.AddStepCommand;
import org.example.memento.command.CreateCommand;
import org.example.memento.command.RemoveStepCommand;
import org.example.memento.command.WorkflowCommand;

import java.util.Collection;
import java.util.LinkedList;

public class Client {

    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();
        LinkedList<WorkflowCommand> commands = runCommands(designer);
        designer.print();
        undoLastCommand(commands);
        designer.print();
        undoLastCommand(commands);
        designer.print();
//        undoLastCommand(commands);
//        designer.print();
    }

    private static void undoLastCommand(LinkedList<WorkflowCommand> commands) {
        if(!commands.isEmpty())
            commands.removeLast().undo();
    }

    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();

        WorkflowCommand cmd = new CreateCommand(designer,"Leave Workflow");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Application Approved");
        commands.addLast(cmd);
        cmd.execute();

//        cmd = new RemoveStepCommand(designer, "Application Approved");
//        cmd.execute();

        return commands;
    }
}
