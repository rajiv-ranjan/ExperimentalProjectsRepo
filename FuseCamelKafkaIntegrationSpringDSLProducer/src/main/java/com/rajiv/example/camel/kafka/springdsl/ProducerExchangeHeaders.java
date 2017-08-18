package com.rajiv.example.camel.kafka.springdsl;

import org.apache.camel.Exchange;
import org.apache.camel.component.kafka.KafkaConstants;

public class ProducerExchangeHeaders {

	
	public void loadKafkaProducerHeaders(Exchange exchange){
		//System.out.println("exchange body class: "+exchange.getIn().getBody().getClass());
		//exchange.getIn().setBody("Test Message from Camel Kafka Component Final",String.class);
        //exchange.getIn().setHeader(KafkaConstants.PARTITION_KEY, 0);
        exchange.getIn().setHeader(KafkaConstants.KEY, "1");
	}
}
