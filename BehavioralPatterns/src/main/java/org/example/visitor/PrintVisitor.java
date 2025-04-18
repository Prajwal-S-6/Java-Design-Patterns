package org.example.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Programmer programmer) {
        String message = programmer.getName() + " is a programmer with skills " + programmer.getSkill();
        System.out.println(message);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        String message = projectLead.getName() + " is a Project lead with " + projectLead.getDirectReports().size() + " direct reports";
        System.out.println(message);
    }

    @Override
    public void visit(Manager manager) {
        String message = manager.getName() + " is a Manager with " + manager.getDirectReports().size() + " direct reports";
        System.out.println(message);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        String message = vicePresident.getName() + " is a VicePresident with " + vicePresident.getDirectReports().size() + " direct reports";
        System.out.println(message);
    }
}
