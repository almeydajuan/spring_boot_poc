package ar.com.jalmeyda.repository;

import ar.com.jalmeyda.config.TestcontainersConfig;
import ar.com.jalmeyda.domain.Task;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
@Import(TestcontainersConfig.class)
public class TaskRepositoryTest {

    @Autowired
    private TaskRepository repository;

    @Test
    public void findTaskById() {
        Task simpleTask = new Task(new Random().nextLong());
        repository.save(simpleTask);

        Optional<Task> taskFound = repository.findById(simpleTask.getId());
        assertTrue(taskFound.isPresent());
        assertEquals(simpleTask, taskFound.get());
    }
}
