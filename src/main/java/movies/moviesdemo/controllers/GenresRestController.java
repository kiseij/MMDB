package movies.moviesdemo.controllers;

import movies.moviesdemo.dao.GenreRepository;
import movies.moviesdemo.entities.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Genres API Controller

@RestController
@RequestMapping("/api/genres")
public class GenresRestController {

    @Autowired
    private GenreRepository repo;

    @DeleteMapping("/{id}")
    public ResponseEntity<Genre> deleteGenre(@PathVariable("id") Integer id){
        try {
            Genre g = repo.findById(id).get();
            repo.delete(g);
            return ResponseEntity.ok(g);
        } catch (Exception error) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genre> updateGenre(
            @PathVariable("id") Integer id,
            @RequestBody Genre genre) {
        genre.setId(id);
        repo.save(genre);
        return ResponseEntity.ok(genre);
    }

    @PostMapping
    public ResponseEntity<?> addNewGenre(@RequestBody Genre genre) {
        repo.save(genre);
        return ResponseEntity.ok(genre);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getGenreById(@PathVariable Integer id) {
        try {
            Genre g = repo.findById(id).get();
            return ResponseEntity.ok(g);
        } catch (Exception error) {
            return ResponseEntity.status(404).body(null);
        }
    }
    @GetMapping
    public Iterable<Genre> getAllGenres() {
        return repo.findAll();
    }
}
