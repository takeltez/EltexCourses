/*
 * This file is generated by jOOQ.
 */
package eltex.tasks.database.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address implements Serializable {

    private static final long serialVersionUID = -621080915;

    private final Long   id;
    private final String building;
    private final String city;
    private final String street;

    public Address(Address value) {
        this.id = value.id;
        this.building = value.building;
        this.city = value.city;
        this.street = value.street;
    }

    public Address(
        Long   id,
        String building,
        String city,
        String street
    ) {
        this.id = id;
        this.building = building;
        this.city = city;
        this.street = street;
    }

    public Long getId() {
        return this.id;
    }

    public String getBuilding() {
        return this.building;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Address (");

        sb.append(id);
        sb.append(", ").append(building);
        sb.append(", ").append(city);
        sb.append(", ").append(street);

        sb.append(")");
        return sb.toString();
    }
}
