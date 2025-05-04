package ar.com.jalmeyda.domain;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    private Long id;

    public Task() {
    }

    public Task(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Task) {
            return id.equals(((Task) obj).id);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
