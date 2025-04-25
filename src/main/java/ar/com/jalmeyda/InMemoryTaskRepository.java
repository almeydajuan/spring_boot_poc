package ar.com.jalmeyda;

import ar.com.jalmeyda.domain.Task;
import org.springframework.data.repository.ListCrudRepository;

public interface InMemoryTaskRepository extends TaskRepository, ListCrudRepository<Task, Long> {
}

