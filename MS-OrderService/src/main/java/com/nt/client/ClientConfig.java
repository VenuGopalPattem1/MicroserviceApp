package com.nt.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

//@FeignClient("MS-InventoryService")
@Component
public class ClientConfig {


	    public Boolean checkOrders(String name, Integer quantity) {
	    	WebClient webClient = WebClient.create("http://localhost:6003/inventory");
	        Mono<Boolean> response = webClient.get()
	            .uri("/check/{name}/{quantity}", name, quantity)
	            .retrieve()
	            .bodyToMono(Boolean.class);
	        
	        // Block the Mono to get the response synchronously (optional)
	        return response.block();
	    }
	



}
