package com.adidas.publicservice.application.rest;


import com.adidas.publicservice.application.request.SubscriptionRequest;
import com.adidas.publicservice.application.rest.mapper.SubscriptionApiMapper;
import com.adidas.publicservice.domain.repository.SubscriptionRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Create new subscription controller.
 *
 */
@RestController
@RequiredArgsConstructor
@Api(tags = "subscriptions")
@RequestMapping("/subscriptions")
public class CreateSubController {

    private final SubscriptionApiMapper mapper;
    private final SubscriptionRepository repository;

    /**
     * Create new subscription.
     *
     * @param request request to create new subscription.
     * @return
     *  - 201 created (new subscription created).
     *  - 400 bad request.
     *  - 500 internal error server (unexpected error).
     */
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create new subscription.")
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public long create(@Valid @RequestBody SubscriptionRequest request) {
        return repository.create(mapper.toDomain(request));
    }

}
