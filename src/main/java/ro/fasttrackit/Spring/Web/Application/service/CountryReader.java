package ro.fasttrackit.Spring.Web.Application.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ro.fasttrackit.Spring.Web.Application.domain.Country;

import java.util.List;


public interface CountryReader {

     List<Country> readCountries();
}
