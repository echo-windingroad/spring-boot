package com.windingroad.tistory.springbootjournal.repository;

import com.windingroad.tistory.springbootjournal.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
