package isakayabasi.manytomanyproject.repository;

import isakayabasi.manytomanyproject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
    public Course findById(int id);
}
