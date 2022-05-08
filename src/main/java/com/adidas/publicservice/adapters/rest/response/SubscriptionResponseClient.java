package com.adidas.publicservice.adapters.rest.response;

import lombok.Data;

@Data
public class SubscriptionResponseClient {

    private Long id;
    private String email;
    private String name;
    private String gender;
    private String birthday;
    private boolean consent;
    private long newsletterId;

}
