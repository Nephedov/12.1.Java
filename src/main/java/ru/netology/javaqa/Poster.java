package ru.netology.javaqa;


public class Poster {
    private String[] films = new String[0];
    private int maxLimit = 10;

    public void save(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;
    }


    public String[] findLast() {
        String[] allFilms = findAll();

        int resultLength;
        if (maxLimit > allFilms.length) {
            resultLength = allFilms.length;
        } else {
            resultLength = maxLimit;
        }

        String[] reverseFilms = new String[resultLength];
        for (int i = 0; i < reverseFilms.length; i++) {
            reverseFilms[i] = allFilms[allFilms.length - 1 - i];
        }
        return reverseFilms;
    }

    public String[] findLast(int maxLimit) {

        String[] allFilms = findAll();

        int resultLength;
        if (maxLimit > allFilms.length) {
            resultLength = allFilms.length;
        } else {
            resultLength = maxLimit;
        }

        String[] reverseFilms = new String[resultLength];
        for (int i = 0; i < reverseFilms.length; i++) {
            reverseFilms[i] = allFilms[allFilms.length - 1 - i];
        }
        return reverseFilms;
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
