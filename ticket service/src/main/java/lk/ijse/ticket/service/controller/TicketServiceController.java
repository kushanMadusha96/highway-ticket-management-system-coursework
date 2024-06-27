package lk.ijse.ticket.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ticket")
public class TicketServiceController {
    @GetMapping("/health")
    public String healthCheck() {
        return "ticket controller";
    }
}
