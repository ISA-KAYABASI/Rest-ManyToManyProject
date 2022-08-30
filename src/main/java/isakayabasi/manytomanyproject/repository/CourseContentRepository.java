package isakayabasi.manytomanyproject.repository;

import isakayabasi.manytomanyproject.entity.CourseContents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContents, Integer> {

    public CourseContents findById(int id);
}
