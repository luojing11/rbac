package com.qf.rbac.entity;

import java.util.Date;

public class TMovie {
    private Long movieId;

    private String movieName;

    private String moviePicture;

    private String movieInfo;

    private Date movieStart;

    private Date movieStop;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public String getMoviePicture() {
        return moviePicture;
    }

    public void setMoviePicture(String moviePicture) {
        this.moviePicture = moviePicture == null ? null : moviePicture.trim();
    }

    public String getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(String movieInfo) {
        this.movieInfo = movieInfo == null ? null : movieInfo.trim();
    }

    public Date getMovieStart() {
        return movieStart;
    }

    public void setMovieStart(Date movieStart) {
        this.movieStart = movieStart;
    }

    public Date getMovieStop() {
        return movieStop;
    }

    public void setMovieStop(Date movieStop) {
        this.movieStop = movieStop;
    }

}