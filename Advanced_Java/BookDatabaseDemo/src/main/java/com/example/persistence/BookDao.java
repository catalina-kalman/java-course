package com.example.persistence;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.dto.entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

	@Query("from Book where genre=:g")
	List<Book> findBooksByGenre(@Param("g") String genre);
	
	@Query("from Book where title=:t")
	List<Book> findBooksByTitle(@Param("t") String title);
}
