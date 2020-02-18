package ir.afarinesh.myhelpdesk.services;

import ir.afarinesh.myhelpdesk.entities.Incident;
import ir.afarinesh.myhelpdesk.repositories.IncidentRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentService {

    private final IncidentRepository incidentRepository;

    public IncidentService(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    public List<Incident> findAllIncidents() {
        return incidentRepository.findAll();
    }
}
