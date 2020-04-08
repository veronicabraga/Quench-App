package org.academiadecodigo.charliesangels.models;

public class Poll {
    private String title;
    private String message;
    private String photo;
    private int minimumVotes;
    private int yes;
    private int no;
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getMinimumVotes() {
        return minimumVotes;
    }

    public void setMinimumVotes(int minimumVotes) {
        this.minimumVotes = minimumVotes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getYes() {
        return yes;
    }

    public void setYes(int yes) {
        this.yes = yes;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
