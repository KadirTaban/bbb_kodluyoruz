package org.example.thirdweek.model.data;


import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.enums.CompanyName;

import java.util.ArrayList;
import java.util.List;

public class TicketData {

        private List<Ticket> tickets;
        public TicketData() {
            this.tickets = new ArrayList<>();
            this.tickets.add(new Ticket(1, "A1",true,true,true,CompanyName.THY));
            this.tickets.add(new Ticket(1, "A2",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(1, "A3",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket(1, "A4",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket(1, "B1",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket(1, "B2",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket(1, "B3",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket(1, "B4",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket(1, "C1",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(1, "C2",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(1, "C3",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(1, "C4",true,false,true,CompanyName.ONUR_AIR));

        }
        public List<Ticket> getTickets() {
            return this.tickets;
        }



    }

