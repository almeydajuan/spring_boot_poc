package ar.com.jalmeyda.repository;

import ar.com.jalmeyda.domain.Task;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class TaskRepositoryTest {

    protected abstract TaskRepository repository();

    @Test
    public void findTaskById() {
        Task simpleTask = new Task();
        simpleTask.setId(new Random().nextLong());
        repository().save(simpleTask);

        Optional<Task> taskFound = repository().findById(simpleTask.getId());
        assertTrue(taskFound.isPresent());
        assertEquals(simpleTask, taskFound.get());
    }
}
