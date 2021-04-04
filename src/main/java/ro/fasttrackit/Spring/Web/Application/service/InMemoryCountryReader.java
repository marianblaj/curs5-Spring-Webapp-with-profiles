package ro.fasttrackit.Spring.Web.Application.service;

import org.springframework.stereotype.Component;
import ro.fasttrackit.Spring.Web.Application.domain.Country;

import java.util.List;

@Component
public class InMemoryCountryReader implements CountryReader{

    @Override
    public List<Country> readCountries() {
        return List.of(
                new Country(0,
                        "Romania",
                        "Bucharest",
                        19000000,
                        217889,
                        Continent.EUROPE,
                        List.of("HUN", "UKR", "MLD", "BLG")),
                new Country(0,
                        "Afghanistan",
                        "Kabul",
                        27657145,
                        652230,
                        Continent.ASIA,
                        List.of("IRN", "PAK", "TKM", "UZB", "TJK", "CHN")),
                new Country(0,
                        "Djibouti",
                        "Djibouti",
                        900000,
                        23200,
                        Continent.AFRICA,
                        List.of("ERI", "ETH", "SOM"))
        );
    }

}
