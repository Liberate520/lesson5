package study_group.view.commands;

import study_group.view.ConsoleUI;

public class GetTeacherInfo extends Command {
    public GetTeacherInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить преподавателя группы";
    }

    public void execute(){
        consoleUI.getTeacherInfo();
    }
}
