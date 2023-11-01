package ir.bu.dao.controller;

import ir.bu.dao.service.ServiceBD;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ControllerBD {
    private final ServiceBD serviceBD;

    public ControllerBD(ServiceBD serviceBD) {
        this.serviceBD = serviceBD;
    }

    @GetMapping("/fetch-product")
    public List<String> productName(@RequestParam("name") String name) {
        return serviceBD.getProductName(name);
    }
}
