package com.propify.challenge;

import java.util.Collection;
import org.apache.ibatis.annotations.Delete;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/properties",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    // API endpoints for CRUD operations on entities of type Property

    @GetMapping
    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        return propertyService.search(minRentPrice, maxRentPrice);
    }
    @GetMapping("/{id}")
    public Property findById(int id) {
        return propertyService.findById(id);
    }

    @PostMapping
    public void insert(@RequestBody Property property) {
        // TODO: Property attributes must be validated
        propertyService.insert(property);
    }

    @PutMapping
    public void update(Property property) {
        // TODO: Property attributes must be validated
        propertyService.update(property);
    }

    @DeleteMapping
    public void delete(int id) {
        propertyService.delete(id);
    }

    public PropertyReport report() {
        return propertyService.propertyReport();
    }
}
