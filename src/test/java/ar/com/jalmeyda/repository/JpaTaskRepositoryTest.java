package ar.com.jalmeyda.repository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class JpaTaskRepositoryTest extends TaskRepositoryTest {

    @Autowired
    JpaTaskRepository repository;

    @Override
    protected TaskRepository repository() {
        return repository;
    }
}
