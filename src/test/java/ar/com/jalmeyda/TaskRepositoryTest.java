package ar.com.jalmeyda;

import ar.com.jalmeyda.domain.Task;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class TaskRepositoryTest {

    @Autowired
    TaskRepository repository;

    @Test
    public void findTaskById() {
        Task simpleTask = new Task();
        repository.save(simpleTask);

        Optional<Task> taskFound = repository.findById(simpleTask.getId());
        assertTrue(taskFound.isPresent());
        assertEquals(simpleTask, taskFound.get());
    }
}
