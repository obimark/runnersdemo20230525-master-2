package hu.gde.runnersdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SposorEntity extends JpaRepository<RunnerEntity,Long > {
}

