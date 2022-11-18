package movies.moviesdemo.controllers;

import movies.moviesdemo.dao.DirectorRepository;
import movies.moviesdemo.entities.Director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Directors API controller

@RestController
@RequestMapping("/api/directors")
public class DirectorsRestController {

    @Autowired
    private DirectorRepository repo;

    @DeleteMapping("/{id}")
    public ResponseEntity<Director> deleteDirector(@PathVariable("id") Integer id){
        try {
            Director d = repo.findById(id).get();
            repo.delete(d);
            return ResponseEntity.ok(d);
        } catch (Exception error) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Director> updateDirector(
            @PathVariable("id") Integer id,
            @RequestBody Director director) {
        director.setId(id);
        repo.save(director);
        return ResponseEntity.ok(director);
    }

    @PostMapping
    public ResponseEntity<?> addNewDirector(@RequestBody Director director) {
        repo.save(director);
        return ResponseEntity.ok(director);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDirectorById(@PathVariable Integer id) {
        try {
            Director d = repo.findById(id).get();
            return ResponseEntity.ok(d);
        } catch (Exception error) {
            return ResponseEntity.status(404).body(null);
        }
    }
    @GetMapping
    public Iterable<Director> getAllDirector() {
        return repo.findAll();
    }
}

