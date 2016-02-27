package ru.maxonandroiddev.doner.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maxonandroiddev.doner.server.entity.DonerDot;

public interface DonerRepository extends JpaRepository<DonerDot, Long> {
}
