package study_group.view.commands;

import study_group.view.ConsoleUI;

public class AddTeacher extends Command {

    public AddTeacher(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить преподавателя";
    }

    public void execute() {
        consoleUI.addTeacher();
    }
}
