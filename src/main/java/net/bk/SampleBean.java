package net.bk;


import net.bk.data.Person;
import net.bk.data.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class SampleBean{


    @Autowired
    PersonRepo personRepo;


    @Value("${greeting}")
    private String say;

    public String saySomething() {

        this.personRepo.save(new Person(say,40));

        return say;
    }

}