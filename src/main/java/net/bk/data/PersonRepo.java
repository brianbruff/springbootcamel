package net.bk.data;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepo extends MongoRepository<Person, Long> {

    Page<Person> findAll(Pageable pageable);

    //Person findByNameAndCountryAllIgnoringCase(String name, String country);

}