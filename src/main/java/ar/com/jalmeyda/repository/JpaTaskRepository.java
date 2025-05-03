package ar.com.jalmeyda.repository;

import ar.com.jalmeyda.domain.Task;
import org.springframework.data.repository.ListCrudRepository;

public interface JpaTaskRepository extends TaskRepository, ListCrudRepository<Task, Long> {
}

