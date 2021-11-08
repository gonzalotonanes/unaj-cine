package com.cine.LoaderData;

import com.cine.database.crudrepository.MovieCrudRepository;
import com.cine.database.crudrepository.TheaterCrudRepository;
import com.cine.database.entities.MovieEntity;
import com.cine.database.entities.TheaterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private MovieCrudRepository movieCrudRepository;
    @Autowired
    private TheaterCrudRepository theaterCrudRepository;

    @Override
    public void run(String... args) throws Exception {
        loadTheaterData();
        loadMovieData();
    }

    private void loadMovieData() {
        if (movieCrudRepository.count() == 0) {
            MovieEntity movie1= new MovieEntity();
            movie1.setTitle("Godzilla");
            movie1.setPoster("www.godzilla.com");
            movie1.setSypnosis("Godzilla, rey de los monstruos");
            movie1.setTrailer("https://www.youtube.com/watch?v=AkcfB3z0_-0&ab_channel=JohnNemesis");

            MovieEntity movie2= new MovieEntity();
            movie2.setTitle("Rambo");
            movie2.setPoster("www.rambo.com");
            movie2.setSypnosis("Es un soldado peligroso");
            movie2.setTrailer("https://www.youtube.com/watch?v=2CRjdwRYQbU&ab_channel=MovieclipsClassicTrailers");

            MovieEntity movie3= new MovieEntity();
            movie3.setTitle("Terminator");
            movie3.setPoster("www.terminator.com");
            movie3.setSypnosis("Un robot asesino");
            movie3.setTrailer("https://www.youtube.com/watch?v=CRRlbK5w8AE&ab_channel=MovieclipsClassicTrailers");

            MovieEntity movie4= new MovieEntity();
            movie4.setTitle("John Wick");
            movie4.setPoster("www.wick.com");
            movie4.setSypnosis("Un perfecto asesino");
            movie4.setTrailer("https://www.youtube.com/watch?v=C0BMx-qxsP4&ab_channel=MovieclipsTrailers");

            MovieEntity movie5= new MovieEntity();
            movie5.setTitle("Mortal kombat");
            movie5.setPoster("www.mk.com");
            movie5.setSypnosis("Lucha sangrienta");
            movie5.setTrailer("https://www.youtube.com/watch?v=Y2O4RCdwCGM&ab_channel=SensaCineTRAILERS");

            MovieEntity movie6= new MovieEntity();
            movie6.setTitle("The purge");
            movie6.setPoster("www.purge.com");
            movie6.setSypnosis("Sociedad despotica");
            movie6.setTrailer("https://www.youtube.com/watch?v=mtoH--n1jtE&ab_channel=SensaCineTRAILERS");

            MovieEntity movie7= new MovieEntity();
            movie7.setTitle("Transformers");
            movie7.setPoster("www.transformers.com");
            movie7.setSypnosis("pelea de robots y humanos");
            movie7.setTrailer("https://www.youtube.com/watch?v=PohlmxCTF9A&ab_channel=MovieTime");

            MovieEntity movie8= new MovieEntity();
            movie8.setTitle("World of warcraft");
            movie8.setPoster("www.worldofwarcraft.com");
            movie8.setSypnosis("Fantasia en la era medieval");
            movie8.setTrailer("https://www.youtube.com/watch?v=fuGRN3dYHKg&ab_channel=UniversalSpain");

            MovieEntity movie9= new MovieEntity();
            movie9.setTitle("The conjuring");
            movie9.setPoster("www.conjuring.com");
            movie9.setSypnosis("terror");
            movie9.setTrailer("https://www.youtube.com/watch?v=oUyHULb7xDI&ab_channel=iMovieTrailersMx");

            MovieEntity movie10= new MovieEntity();
            movie10.setTitle("Cruella");
            movie10.setPoster("www.cruella.com");
            movie10.setSypnosis("Moda");
            movie10.setTrailer("https://www.youtube.com/watch?v=oK13SZYZqmA&ab_channel=SensaCineTRAILERS");

            movieCrudRepository.save(movie1);
            movieCrudRepository.save(movie2);
            movieCrudRepository.save(movie3);
            movieCrudRepository.save(movie4);
            movieCrudRepository.save(movie5);
            movieCrudRepository.save(movie6);
            movieCrudRepository.save(movie7);
            movieCrudRepository.save(movie8);
            movieCrudRepository.save(movie9);
            movieCrudRepository.save(movie10);

        }
    }

    private void loadTheaterData() {
        if (theaterCrudRepository.count() == 0) {
            TheaterEntity entity1 = new TheaterEntity();
            entity1.setCapacity(5);
            TheaterEntity entity2 = new TheaterEntity();
            entity2.setCapacity(15);
            TheaterEntity entity3 = new TheaterEntity();
            entity3.setCapacity(35);

            theaterCrudRepository.save(entity1);
            theaterCrudRepository.save(entity2);
            theaterCrudRepository.save(entity3);

        }

    }

}
