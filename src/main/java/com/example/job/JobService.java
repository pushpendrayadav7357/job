package com.example.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return (List<Job>) jobRepository.findAll();
    }

    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Job updateJobTitle(Long id, String title) {
        int updated = jobRepository.updateJobTitle(id, title);
        if (updated == 1) {
            return jobRepository.findById(id).orElse(null);
        }
        return null;
    }

    public void deleteJobById(Long id) {
        jobRepository.deleteJobById(id);
    }

    public List<Job> findJobsByTitle(String title) {
        return jobRepository.findByTitleContaining(title);
    }

    public List<Job> findJobsByDescription(String description) {
        return jobRepository.findByDescriptionContaining(description);
    }
}
