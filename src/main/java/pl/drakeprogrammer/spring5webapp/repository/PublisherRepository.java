package pl.drakeprogrammer.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import pl.drakeprogrammer.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
