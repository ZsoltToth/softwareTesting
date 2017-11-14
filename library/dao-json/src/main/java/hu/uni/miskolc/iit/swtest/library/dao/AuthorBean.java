package hu.uni.miskolc.iit.swtest.library.dao;

import hu.uni.miskolc.iit.swtest.library.core.model.Author;
import hu.uni.miskolc.iit.swtest.library.core.model.Nationality;

/**
 * Created by tothzs on 2017.10.10..
 */
class AuthorBean {

    private String name;
    private Nationality nationality;

    public AuthorBean() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public static AuthorBean convert(Author author){
        AuthorBean result = new AuthorBean();
        result.setName(author.getName());
        result.setNationality(author.getNationality());
        return result;
    }

    public Author extract(){
        return  new Author(name,nationality);
    }
}
