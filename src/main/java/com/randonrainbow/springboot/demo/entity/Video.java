package com.randonrainbow.springboot.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

// if the id will be initialized at the data base how do i define the contructor
@Entity
@Table(name="video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="id_artist")
    private int idArtist;
    @Column(name="title")
    private String title;
    @Column(name="video_description")
    private String videoDescription;
    @Column(name="video_link")
    private String videoLink;
    private int duration;
    private boolean checked;
    private boolean approved;

    public Video(){
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", idArtist=" + idArtist +
                ", title='" + title + '\'' +
                ", videoDescription='" + videoDescription + '\'' +
                ", videoLink='" + videoLink + '\'' +
                '}';
    }

    public Video(int idArtist, String title, String videoDescription, String videoLink) {
        this.idArtist = idArtist;
        this.title = title;
        this.videoDescription = videoDescription;
        this.videoLink = videoLink;
        this.checked=false;
        this.approved=false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(int idArtist) {
        this.idArtist = idArtist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
