import model.Priority;
import model.Status;
import task.Task;
import task.TaskData;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annTasks = new LinkedHashSet<>();
        Set<Task> bobTasks = new LinkedHashSet<>();
        Set<Task> carolTasks = new LinkedHashSet<>();

        annTasks.add(new Task("sets", "practicing sets vol1", "ann", Priority.LOW, Status.IN_PROGRESS));
        bobTasks.add(new Task("sets", "practicing sets vol2", "bob", Priority.MID, Status.ASSIGNED));
        carolTasks.add(new Task("sets", "practicing sets vol3", "carol", Priority.HIGH, Status.IN_QUEUE));

        TaskData taskData = new TaskData(annTasks, bobTasks, carolTasks, null);

        printTasks(Task.getAllTasks());
    }

    private static void printTasks(Set<Task> tasks) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println("Task detail: \nProject: " + task.getProject() + " | "
                    + " Description: " + task.getDescription() + " | "
                    + " Assignee: " + task.getAssignee() + " | "
                    + " Priority: " + task.getPriority() + " | "
                    + " Status: " + task.getStatus() + "\n");
        }
    }
}