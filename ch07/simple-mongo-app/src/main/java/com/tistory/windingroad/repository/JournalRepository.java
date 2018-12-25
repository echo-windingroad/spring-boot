package com.tistory.windingroad.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.tistory.windingroad.domain.Journal;

public interface JournalRepository extends MongoRepository<Journal, String> {

  public List<Journal> findByTitleLike(String word);

}
