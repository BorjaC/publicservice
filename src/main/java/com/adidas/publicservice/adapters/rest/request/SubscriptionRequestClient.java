package com.adidas.publicservice.adapters.rest.request;

import lombok.Data;

@Data
public class SubscriptionRequestClient {

    private String email;
    private String name;
    private String gender;
    private String birthday;
    private Boolean consent;
    private Long newsletterId;

}
