package ir.afarinesh.myhelpdesk.repositories;

import ir.afarinesh.myhelpdesk.entities.Incident;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IncidentRepository extends CrudRepository<Incident, Long> {
    List<Incident> findAll();
}
