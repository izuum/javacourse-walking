package day41.Task1;

import day41.Task1.model.Task;

import java.util.*;

public class TaskService {
    private final LinkedHashSet<Task> taskQueue = new LinkedHashSet<>();

    public Task addTask(Task task){
        taskQueue.add(task);
        System.out.printf("Task %s is success added\n", task.getTitle());

        return task;
    }

    public void executeTask(){
        Iterator<Task> taskIterator = taskQueue.iterator();

        if(!taskIterator.hasNext()){
            System.out.println("Task's queue is empty");
        } else {
            System.out.printf("Task %s is completed\n", taskIterator.next().getTitle());
            taskIterator.remove();
        }
    }
}
