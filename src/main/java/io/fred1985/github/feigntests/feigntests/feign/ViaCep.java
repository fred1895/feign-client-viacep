package io.fred1985.github.feigntests.feigntests.feign;

import io.fred1985.github.feigntests.feigntests.domain.Place;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCep", url = "https://viacep.com.br/ws")
public interface ViaCep {

    @GetMapping("/{cep}/json/")
    public Place getPlace(@PathVariable String cep);

}
