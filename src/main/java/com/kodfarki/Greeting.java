package com.kodfarki;

/**
 * User: Halil Karakose
 * Date: 14.02.2018
 * Time: 17:19
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}