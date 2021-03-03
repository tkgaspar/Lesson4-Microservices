package com.udacity.DogMicroservice.Repository;

import com.udacity.DogMicroservice.Entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface dogRepository  extends CrudRepository<Dog,Long> {
}
