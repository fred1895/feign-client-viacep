package io.fred1985.github.feigntests.feigntests.resource;

import io.fred1985.github.feigntests.feigntests.domain.Place;
import io.fred1985.github.feigntests.feigntests.feign.rest.ViaCepRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cep")
public class ViaCepResource {

    @Autowired
    private ViaCepRest cepRest;


    @GetMapping("/{code}")
    public Place getPlaceByCode(@PathVariable String code) {
        Place place = cepRest.getPlaceFromViaCep(code);
        return place;
    }
}
