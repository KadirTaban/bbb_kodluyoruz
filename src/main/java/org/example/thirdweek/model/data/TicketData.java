package org.example.thirdweek.model.data;


import org.example.thirdweek.entity.Ticket;
import org.example.thirdweek.enums.CompanyName;

import java.util.ArrayList;
import java.util.List;

public class TicketData {

        private List<Ticket> tickets;
        public TicketData() {
            this.tickets = new ArrayList<>();
            this.tickets.add(new Ticket("A1",true,true,true,CompanyName.THY));
            this.tickets.add(new Ticket("A2",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket("A3",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket("A4",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket("B1",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket("B2",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket("B3",true,false,true,CompanyName.PEGASUS));
            this.tickets.add(new Ticket("B4",true,false,true,CompanyName.ONUR_AIR));
            this.tickets.add(new Ticket("C1",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket("C2",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket("C3",true,false,true,CompanyName.THY));
            this.tickets.add(new Ticket("C4",true,false,true,CompanyName.ONUR_AIR));

        }
        public List<Ticket> getTickets() {
            return this.tickets;
        }



    }

