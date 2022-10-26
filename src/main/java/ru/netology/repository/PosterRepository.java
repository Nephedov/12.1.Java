package ru.netology.repository;

import ru.netology.domain.Film;

public class PosterRepository {
    private Film[] films = new Film[0];


    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }


    public Film findById(int id) {
        Film tmp = null;
        for (Film film : films) {
            if (film.getId() == id) {
                tmp = film;
            }
        }
        return tmp;
    }

    public void removeById(int id) {
        Film[] tmp = new Film[films.length - 1];
        int copyToIndex = 0;
        for (Film film : films) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }


    public Film[] findAll() {
        return films;
    }

    public void removeAll() {
        Film[] tmp = new Film[0];
        films = tmp;
    }
/*    public void removeById (int id) {
        Films [] tmp = new Films [films.length - 1];
        int copyToIndex = 0;
        for (Films film:films) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        } films = tmp;

    }

 */
}
