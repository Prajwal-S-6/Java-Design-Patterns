package org.example.command;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command {

    private String contact;

    private String contactGroup;

    private EWSService ewsService;

    public AddMemberCommand(String contact, String contactGroup, EWSService ewsService) {
        this.contact = contact;
        this.contactGroup = contactGroup;
        this.ewsService = ewsService;
    }

    @Override
    public void execute() {
        this.ewsService.addMember(contact, contactGroup);
    }
}
