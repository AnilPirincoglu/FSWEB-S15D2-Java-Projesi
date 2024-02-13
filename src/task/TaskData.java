package task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobTasks;
    private Set<Task> carolTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobTasks, Set<Task> carolTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobTasks = bobTasks;
        this.carolTasks = carolTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobTasks() {
        return bobTasks;
    }

    public Set<Task> getCarolTasks() {
        return carolTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        switch (name.toLowerCase()) {
            case "ann":
                return this.getAnnsTasks();
            case "carol":
                return this.getCarolTasks();
            case "bob":
                return this.getBobTasks();
            case "all":
                return getUnion(bobTasks, annsTasks, carolTasks);
            default:
                return new HashSet<>();
        }
    }

    private Set<Task> getUnion(Set<Task>... sets) {
        HashSet<Task> total = new LinkedHashSet<>();
        for (Set<Task> taskSet : sets)
            total.addAll(taskSet);
        return total;
    }
}
