package com.example.job;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping
    public Job createJob(@Valid @RequestBody Job job) {
        return jobService.createJob(job);
    }

    @PutMapping("/{id}")
    public Job updateJobTitle(@PathVariable Long id, @RequestParam String title) {
        return jobService.updateJobTitle(id, title);
    }

    @DeleteMapping("/{id}")
    public void deleteJobById(@PathVariable Long id) {
        jobService.deleteJobById(id);
    }

    @GetMapping("/searchByTitle")
    public List<Job> findJobsByTitle(@RequestParam String title) {
        return jobService.findJobsByTitle(title);
    }

    @GetMapping("/searchByDescription")
    public List<Job> findJobsByDescription(@RequestParam String description) {
        return jobService.findJobsByDescription(description);
    }
}
