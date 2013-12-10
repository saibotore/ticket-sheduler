package de.tgehring.tsheduler.bean;

public class Task {

    private long id;
    private Ticket ticket;
    private int estimatedTime;
    private String description;
    private TaskState state;
    private int order;
}
