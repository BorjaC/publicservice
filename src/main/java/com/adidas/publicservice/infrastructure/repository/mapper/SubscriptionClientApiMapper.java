package com.adidas.publicservice.infrastructure.repository.mapper;

import com.adidas.publicservice.adapters.rest.request.SubscriptionRequestClient;
import com.adidas.publicservice.adapters.rest.response.SubscriptionResponseClient;
import com.adidas.publicservice.domain.Subscription;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubscriptionClientApiMapper {

    SubscriptionRequestClient toRequest(Subscription subscription);

    Subscription toDomain(SubscriptionResponseClient response);

    List<Subscription> toDomain(List<SubscriptionResponseClient> response);

}
