package com.adidas.publicservice.adapters.rest;

import com.adidas.publicservice.adapters.rest.request.SubscriptionRequestClient;
import com.adidas.publicservice.adapters.rest.response.SubscriptionResponseClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "SubscriptionClient", url = "${adidas.service.subscription.url}", path = "/subscriptions")
public interface SubscriptionClient {

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    void cancel(@RequestHeader("Authorization") String authorization, @PathVariable("id") Long id);

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    long create(@RequestHeader("Authorization") String authorization, @RequestBody SubscriptionRequestClient request);

    @RequestMapping(method = RequestMethod.GET)
    List<SubscriptionResponseClient> findAll(@RequestHeader("Authorization") String authorization);

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    SubscriptionResponseClient findById(@RequestHeader("Authorization") String authorization, @PathVariable("id") Long id);

}
