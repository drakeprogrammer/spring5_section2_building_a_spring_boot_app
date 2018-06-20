package pl.drakeprogrammer.spring5webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import pl.drakeprogrammer.spring5webapp.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
