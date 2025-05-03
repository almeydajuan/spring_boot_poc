package ar.com.jalmeyda.repository;

class InMemoryTaskRepositoryTest extends TaskRepositoryTest {

    private final InMemoryTaskRepository repository = new InMemoryTaskRepository();

    @Override
    protected TaskRepository repository() {
        return repository;
    }
}