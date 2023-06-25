## Airflight Ticket Hunter

### Assignments
- Scrapping data from mock data on to db and open to some api for display available tickets, buy tickets, categorized available tickets.

### Tech

- Spring Boot 11
- H2 database
- Lombok

### Design Patterns
- Factory
- Builder
- Dependency Injection

#### API
- Initialization api -> 127.0.0.1:8000/api/v1/ticket/save 
- Buy Ticket Api -> 127.0.0.1:8000/api/v1/ticketTHY/buyTicket/1 (will edit)
- Just Available THY tickets -> 127.0.0.1:8000/api/v1/ticketTHY/availableTickets
- Just Available Pegasus tickets -> 127.0.0.1:8000/api/v1/ticketPegasus/availableTickets
- All Available tickets -> 127.0.0.1:8000/api/v1/ticket/availableTicket