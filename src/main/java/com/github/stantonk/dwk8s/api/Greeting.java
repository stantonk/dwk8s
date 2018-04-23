package com.github.stantonk.dwk8s.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

    private String fullGreeting;

    public Greeting() {
    }

    public Greeting(String fullGreeting) {
        this.fullGreeting = fullGreeting;
    }

    @JsonProperty
    public String getFullGreeting() {
        return fullGreeting;
    }

    @JsonProperty
    public void setFullGreeting(String fullGreeting) {
        this.fullGreeting = fullGreeting;
    }
}
