package ar.com.jalmeyda.repository;

import ar.com.jalmeyda.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

