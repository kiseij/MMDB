package movies.moviesdemo.controllers;

import movies.moviesdemo.dao.MovieRepository;
import movies.moviesdemo.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MoviesRestController {

    @Autowired
    private MovieRepository repo;

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/{id}")
    public ResponseEntity<Movie> deleteMovie(@PathVariable("id") Integer id){
        try {
            Movie m = repo.findById(id).get();
            repo.delete(m);
            return ResponseEntity.ok(m);
        } catch (Exception error) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(
            @PathVariable("id") Integer id,
            @RequestBody Movie movie) {
        movie.setId(id);
        repo.save(movie);
        return ResponseEntity.ok(movie);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<?> addNewMovie(@RequestBody Movie movie) {
        repo.save(movie);
        return ResponseEntity.ok(movie);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable Integer id) {
        try {
            Movie m = repo.findById(id).get();
//            if(m.genre_id) {
//              genre = genreRepo.findById(m.genre_id)
//              m.genre = genre
//            }
            return ResponseEntity.ok(m);
        } catch (Exception error) {
            return ResponseEntity.status(404).body(null);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public Iterable<Movie> getAllMovies(
            @RequestParam(name = "_page", defaultValue = "1") Integer pageNum,
            @RequestParam(name = "_limit", defaultValue = "100") Integer pageSize) {
        Pageable p = PageRequest.of(pageNum-1, pageSize);
        return repo.findAll(p).getContent();
    }
}
