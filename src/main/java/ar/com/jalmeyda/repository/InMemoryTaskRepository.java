package ar.com.jalmeyda.repository;

import ar.com.jalmeyda.domain.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryTaskRepository implements TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

        @Override
    public Task save(Task task) {
        tasks.add(task);
        return task;
    }

    @Override
    public Optional<Task> findById(Long id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst();
    }
}
