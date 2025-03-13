package day41.Task1;

import day41.Task1.model.Task;

public class Main {
    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        taskService.addTask(new Task("Sleep"));
        taskService.addTask(new Task("Wake Up"));
        taskService.addTask(new Task("Go to"));
        taskService.addTask(new Task("Go Work"));
        taskService.addTask(new Task("Set up"));

        taskService.executeTask();
        taskService.executeTask();

        taskService.addTask(new Task("Morning Run"));

        taskService.executeTask();
        taskService.executeTask();
        taskService.executeTask();
        taskService.executeTask();
        taskService.executeTask();
    }
}
