package ru.netology;

import ru.netology.domain.Film;
import ru.netology.repository.PosterRepository;

public class PosterManager {
    private PosterRepository repo;
    private int maxLimit;


    public PosterManager(PosterRepository repo) {
        this.repo = repo;
        this.maxLimit = 10;
    }

    public PosterManager(PosterRepository repo, int maxLimit) {
        this.repo = repo;
        this.maxLimit = maxLimit;
    }


    public void add(Film film) {
        repo.save(film);
    }

    public Film[] getAll() {
        return repo.findAll();
    }

    public Film[] getLast() {
        Film[] allFilms = getAll();

        int resultLength;
        if (maxLimit > allFilms.length) {
            resultLength = allFilms.length;
        } else {
            resultLength = maxLimit;
        }

        Film[] reverseFilms = new Film[resultLength];
        for (int i = 0; i < reverseFilms.length; i++) {
            reverseFilms[i] = allFilms[allFilms.length - 1 - i];
        }
        return reverseFilms;
    }
}
