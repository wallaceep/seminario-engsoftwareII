import java.util.Enumeration;
import java.util.Vector;

public class Employee {
    private String _name;
    private Vector _tasks = new Vector();

    public Employee(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void addTask(Task task) {
        _tasks.addElement(task);
    }

    public String report() {
        double totalHours = 0;
        int completedTasks = 0;
        Enumeration tasks = _tasks.elements();
        String result = "Task Report for " + getName() + "\n";
        while (tasks.hasMoreElements()) {
            double thisHours = 0;
            Task each = (Task) tasks.nextElement();

            // determine hours for each task
            switch (each.getType()) {
                case Task.REGULAR:
                    thisHours += 8;
                    if (each.getDaysTaken() > 1)
                        thisHours += (each.getDaysTaken() - 1) * 6;
                    break;
                case Task.URGENT:
                    thisHours += each.getDaysTaken() * 10;
                    break;
                case Task.OPTIONAL:
                    thisHours += 4;
                    if (each.getDaysTaken() > 2)
                        thisHours += (each.getDaysTaken() - 2) * 2;
                    break;
            }

            // add completed tasks
            completedTasks++;

            // show figures for this task
            result += "\t" + each.getName() + "\t" + String.valueOf(thisHours) + "\n";
            totalHours += thisHours;
        }

        // add footer lines
        result += "Total hours worked: " + String.valueOf(totalHours) + "\n";
        result += "Total tasks completed: " + String.valueOf(completedTasks) + "\n";
        return result;
    }
}