package com.example.todo.controller;

import com.example.todo.entity.Task;
import com.example.todo.repository.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Task> all() {
        return repo.findAllByOrderByIdDesc();
    }

    @PostMapping
    public ResponseEntity<Task> create(@Valid @RequestBody Task t) {
        t.setId(null);
        Task saved = repo.save(t);
        return ResponseEntity.created(URI.create("/api/tasks/" + saved.getId())).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @Valid @RequestBody Task body) {
        return repo.findById(id)
                .map(existing -> {
                    existing.setTitle(body.getTitle());
                    existing.setCompleted(body.isCompleted());
                    Task saved = repo.save(existing);
                    return ResponseEntity.ok(saved);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!repo.existsById(id)) return ResponseEntity.notFound().build();
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
