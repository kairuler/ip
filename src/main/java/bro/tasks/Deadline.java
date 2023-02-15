package bro.tasks;

public class Deadline extends Task{
    private String deadline;
    public Deadline(String name, String deadline) {
        super(name);
        this.setType("D");
        this.deadline = deadline;
    }
    @Override
    public String toString() {
        return super.toString() + " (by: " + deadline + ")";
    }
}