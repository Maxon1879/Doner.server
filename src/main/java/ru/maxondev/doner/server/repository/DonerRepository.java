package ru.maxondev.doner.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxondev.doner.server.entity.DonerDot;

public interface DonerRepository extends JpaRepository<DonerDot, Long> {
}
