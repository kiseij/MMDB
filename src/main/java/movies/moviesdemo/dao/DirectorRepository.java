package movies.moviesdemo.dao;

import movies.moviesdemo.entities.Director;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Integer> {
}