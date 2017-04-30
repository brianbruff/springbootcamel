package net.bk;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class SampleBean{


    //@Autowired
   // PersonRepo personRepo;

   // private final MongoDbFactory mongo;

//    @Autowired
//    public SampleBean(MongoDbFactory mongo) {
//        this.mongo = mongo;
//    }

    @Value("${greeting}")
    private String say;

    public String saySomething() {
      //  DB db =mongo.getDb("DemoSpring");

     //   DBCollection collection = db.getCollection("People");

       // Page<Person> personPage = personRepo.findAll(new PageRequest(0,10));

        return say;
    }

}