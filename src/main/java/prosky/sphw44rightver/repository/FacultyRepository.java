package prosky.sphw44rightver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prosky.sphw44rightver.entity.Faculty;

import java.util.Collection;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findAllByNameIgnoreCase(String name);
    Collection<Faculty> findAllByColorIgnoreCase(String color);
}
