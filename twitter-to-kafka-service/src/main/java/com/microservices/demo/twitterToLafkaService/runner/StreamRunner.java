package com.microservices.demo.twitterToLafkaService.runner;

import twitter4j.TwitterException;

public interface StreamRunner {
    void start() throws TwitterException;
}
