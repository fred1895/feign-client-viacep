package io.fred1985.github.feigntests.feigntests.feign.rest;

import io.fred1985.github.feigntests.feigntests.domain.Place;
import io.fred1985.github.feigntests.feigntests.feign.ViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ViaCepRest {
    @Autowired
    private ViaCep viaCep;

    @GetMapping
    public Place getPlaceFromViaCep() {
        Place place = viaCep.getPlace("28924248");
        System.out.println(place.getCep());
        System.out.println(place.getBairro());
        System.out.println(place.getLocalidade());
        System.out.println(place.getLogradouro());
        return place;

    }
}
