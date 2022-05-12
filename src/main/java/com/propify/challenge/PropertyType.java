package com.propify.challenge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PropertyType {

    public static final PropertyType SINGLE_FAMILY = new PropertyType("Single Family");
    public static final PropertyType MULTI_FAMILY = new PropertyType("Multi-family");
    public static final PropertyType CONDOMINIUM = new PropertyType("Condominium");
    public static final PropertyType TOWNHOUSE = new PropertyType("Townhouse");

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public String type;

    public PropertyType(String type) {
        this.type = type;
    }

    public PropertyType() {

    }
}
