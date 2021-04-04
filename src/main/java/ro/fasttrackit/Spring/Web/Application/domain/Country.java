package ro.fasttrackit.Spring.Web.Application.domain;

import lombok.Data;
import ro.fasttrackit.Spring.Web.Application.service.Continent;

import java.util.List;

@Data
public class Country {


    private int id;

    private final String name;
    private final String capital;
    private final long population;
    private final long area;
    private final Continent continent;
    private final List<String> neighbours;

    public Country(long id, String name, String capital, long population, long area, Continent continent, List<String> neighbours) {

        this.id = java.lang.System.identityHashCode(this);
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbours = neighbours;
    }
}



