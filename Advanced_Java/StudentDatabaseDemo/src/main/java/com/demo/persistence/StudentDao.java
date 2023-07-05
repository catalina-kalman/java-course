package com.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.demo.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{
	@Query("from Student where classNo=:c")
	List<Student> getStudentsByClass(@Param("c") int classNo);
}
