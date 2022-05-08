package com.adidas.publicservice.application.rest.mapper;

import com.adidas.publicservice.application.request.SubscriptionRequest;
import com.adidas.publicservice.application.response.SubscriptionResponse;
import com.adidas.publicservice.domain.Subscription;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubscriptionApiMapper {

    Subscription toDomain(SubscriptionRequest request);

    SubscriptionResponse toResponse(Subscription source);

    List<SubscriptionResponse> toResponse(List<Subscription> source);

}
