package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by efilin on 24.12.2020.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
