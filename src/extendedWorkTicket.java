import java.time.LocalDate;

public class extendedWorkTicket extends workticket
{
    private boolean myOpen;
    boolean isOpen() {
        return myOpen;
    }
    void openTicket() {
        this.myOpen = true;
    }
    void closeTicket() {
        this.myOpen = false;
    }

    public extendedWorkTicket() {
        super();
        openTicket();
    }

    public extendedWorkTicket(long workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        super(workTicketNumber, clientID, workTicketDate, issueDescription);
        openTicket();
    }

    public extendedWorkTicket(workticket wt) {
        super(wt.getWorkTicketNumber(), wt.getClientID(), wt.getWorkTicketDate(), wt.getIssueDescription());
        openTicket();
    }

    @Override
    public boolean SetWorkTicket(long workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        if (super.SetWorkTicket(workTicketNumber, clientID, workTicketDate, issueDescription)) {
            openTicket();
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String output = super.ShowWorkTicket();
        String ticketState = isOpen() ? "OPEN" : "CLOSED";
        output = output + "\n" + "Ticket: " + ticketState;
        return output;
    }

    public static void main(String[] args) {



    }
}
