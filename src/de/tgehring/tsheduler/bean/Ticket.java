package de.tgehring.tsheduler.bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Ticket {

    private long ticketNumber;
    private Ticket parentTicket;
    private List<Ticket> children;
    private List<Task> tasks;
    private User editor;
    private String title;
    private TicketState state;
    private TicketType type;
    private Sprint sprint;
    private int priority;
}
