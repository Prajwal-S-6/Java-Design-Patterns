package org.example.memento;

public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(String name) {
        workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return this.workflow;
    }

    public Memento createMemento() {
       if(workflow == null) {
           return new Memento();
       }
       return new Memento(workflow.getName(), workflow.getSteps());
    }

    public void setStateUsingMemento(Memento memento) {
        if(memento.isEmpty()) {
            this.workflow = null;
        } else {
            this.workflow = new Workflow(memento.name, memento.steps);
        }
    }

    public void addStep(String step) {
        workflow.addStep(step);
    }

    public void removeStep(String step) {
        workflow.removeStep(step);
    }

    public void print() {
        System.out.println(workflow);
    }

    public class Memento {

        private String[] steps;

        private String name;

        private Memento() {
        }

        private Memento(String name, String[] steps) {
            this.steps = steps;
            this.name = name;
        }

        private boolean isEmpty() {
            return this.steps == null && this.name == null;
        }

    }
}
