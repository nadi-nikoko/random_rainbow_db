package com.randonrainbow.springboot.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Artist {
    private String id;
    private String name;
    private String pronouns;
    private String socialMedia;
    private String email;

    public Artist(String name, String pronouns, String email) {
        this.name = name;
        this.pronouns = pronouns;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
