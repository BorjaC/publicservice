package com.adidas.publicservice.domain.repository;

import com.adidas.publicservice.domain.Subscription;

import java.util.List;

public interface SubscriptionRepository {

    Long create(Subscription subscription);

    void cancel(Long subscriptionId);

    Subscription findById(Long subscriptionId);

    List<Subscription> findAll();

}
