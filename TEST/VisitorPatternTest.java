package Test;

import Ticket.Visitor.*;

public class VisitorPatternTest {
    public static void main(final String[] args)
    {
        final TicketStructure os = new TicketStructure();
        os.addElement(new FullTicket());
        os.addElement(new HalfTicket());
        final Single sVisitor = new Single();
        final Group gVisitor = new Group();
        final Single sVisitor2 = new Single();
        os.accept(sVisitor);
        os.accept(gVisitor);
        os.accept(sVisitor2);
    }
}
