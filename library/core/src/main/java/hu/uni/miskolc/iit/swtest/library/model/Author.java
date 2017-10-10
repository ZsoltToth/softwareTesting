package hu.uni.miskolc.iit.swtest.library.model;

/**
 * Created by tothzs on 2017.10.10..
 */
public class Author {

    private String name;
    private Nationality nationality;

    public Author(String name, Nationality nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
