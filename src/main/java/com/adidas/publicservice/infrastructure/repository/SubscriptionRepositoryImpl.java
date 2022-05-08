package com.adidas.publicservice.infrastructure.repository;

import com.adidas.publicservice.adapters.rest.SubscriptionClient;
import com.adidas.publicservice.domain.Subscription;
import com.adidas.publicservice.domain.repository.SubscriptionRepository;
import com.adidas.publicservice.infrastructure.repository.mapper.SubscriptionClientApiMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubscriptionRepositoryImpl implements SubscriptionRepository {

    private static final String authorization = "password";

    private final SubscriptionClient client;
    private final SubscriptionClientApiMapper mapper;


    @Override
    @Transactional
    public Long create(Subscription subscription) {
        return client.create(authorization, mapper.toRequest(subscription));
    }

    @Override
    @Transactional
    public void cancel(Long subscriptionId) {
        client.cancel(authorization, subscriptionId);
    }

    @Override
    @Transactional
    public Subscription findById(Long subscriptionId) {
        return mapper.toDomain(client.findById(authorization, subscriptionId));
    }

    @Override
    @Transactional
    public List<Subscription> findAll() {
        return mapper.toDomain(client.findAll(authorization));
    }
}
