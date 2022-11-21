package movies.moviesdemo.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="movies")
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "`YEAR`")
    private String year;
    @Column(name = "genre_id")
    private Long genreId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="genre_id", updatable = false, insertable = false)
    private Genre genre;
    @Column(name = "director_id")
    private Long directorId;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "director_id", updatable = false, insertable = false)
    private Director director;
}


