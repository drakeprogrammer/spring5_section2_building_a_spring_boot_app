package pl.drakeprogrammer.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import pl.drakeprogrammer.spring5webapp.model.Author;
import pl.drakeprogrammer.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
