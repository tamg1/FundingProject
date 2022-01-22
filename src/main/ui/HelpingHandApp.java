package ui;

import model.ProjectInNeed;

public class HelpingHandApp {
    public static void main(String[] args) {
        ProjectInNeed project = new ProjectInNeed("SportsForKids", 5000);
        project.increaseTargetBy(1000);
        project.decreaseTargetBy(500);
        project.fund(250);
    }
}
