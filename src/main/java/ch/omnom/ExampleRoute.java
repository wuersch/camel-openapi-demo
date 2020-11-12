package ch.omnom;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class ExampleRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("direct:createContact")
            .log("${body}")
            .to("mock:backend")
            .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(201))
            .setBody();
    }
}
