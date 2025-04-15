package ar.com.jalmeyda;

import ar.com.jalmeyda.domain.Task;
import org.springframework.data.repository.ListCrudRepository;

public interface TaskRepository extends ListCrudRepository<Task, Long> { }
