package ir.afarinesh.myhelpdesk.controllers;

import ir.afarinesh.myhelpdesk.entities.Incident;
import ir.afarinesh.myhelpdesk.services.IncidentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/incident")
public class IncidentController {

    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GetMapping("/all")
    public List<Incident> all() {
        return incidentService.findAllIncidents();
    }
}
