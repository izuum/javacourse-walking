package day40.Task1;

import day40.Task1.model.Task;
import java.util.ArrayDeque;
import java.util.Queue;

public class TaskService {
    private final Queue<Task> taskQueue = new ArrayDeque<>();

    public Task addTask(Task task){
        taskQueue.offer(task);
        System.out.printf("Task %s is success added\n", task.getTitle());

        return task;
    }

    public void executeTask(){
        Task task = taskQueue.poll();

        if(task == null){
            System.out.println("Task's queue is empty");
        } else{
            System.out.printf("Task %s is completed\n", task.getTitle());
        }
    }
}
