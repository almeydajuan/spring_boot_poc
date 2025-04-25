package ar.com.jalmeyda.repository;

import ar.com.jalmeyda.domain.Task;

import java.util.Optional;

public interface TaskRepository {
    Task save(Task task);

    Optional<Task> findById(Long id);
}
