//package net.bk;
//
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SampleCamelRouter extends RouteBuilder {
//
//    @Override
//    public void configure() throws Exception {
//        from("timer:hellox?period={{timer.period}}")
//                .transform(method("myBean", "saySomething"))
//                .to("stream:out");
//    }
//
//}