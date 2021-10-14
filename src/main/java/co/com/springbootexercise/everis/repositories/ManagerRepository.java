package co.com.springbootexercise.everis.repositories;

import co.com.springbootexercise.everis.models.ManagerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends CrudRepository<ManagerModel, String> {

}
