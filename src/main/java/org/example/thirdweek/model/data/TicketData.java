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
            this.tickets.add(new Ticket(2, "A2",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(3, "A3",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket(4, "A4",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket(5, "B1",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket(6, "B2",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket(7, "B3",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket(8, "B4",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket(9, "C1",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(10, "C2",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(11, "C3",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket(12, "C4",true,false,true,CompanyName.ONUR_AIR));

        }
        public List<Ticket> getTickets() {
            return this.tickets;
        }



    }

