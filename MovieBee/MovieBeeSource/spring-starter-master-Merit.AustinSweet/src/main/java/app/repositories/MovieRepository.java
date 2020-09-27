package app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import app.models.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	//List<Movie> findByUserId(Long userId);
}
