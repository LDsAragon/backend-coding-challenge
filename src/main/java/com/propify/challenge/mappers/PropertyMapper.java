package com.propify.challenge.mappers;

import com.propify.challenge.entities.Property;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface PropertyMapper {

    public void insert(Property property);

    public Set<Property> search(String minRentPrice, String maxRentPrice);

    public Property findById(Integer id);

    public void update(Property property);

    public void delete(Integer id);
}
