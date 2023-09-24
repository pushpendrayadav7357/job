package com.example.job;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {
    List<Job> findByTitleContaining(String title);
    List<Job> findByDescriptionContaining(String description);
    @Modifying
    @Transactional
    @Query("UPDATE Job j SET j.title = :title WHERE j.id = :id")
    int updateJobTitle(@Param("id") Long id, @Param("title") String title);

    @Modifying
    @Transactional
    @Query("DELETE FROM Job j WHERE j.id = :id")
    void deleteJobById(@Param("id") Long id);




}
