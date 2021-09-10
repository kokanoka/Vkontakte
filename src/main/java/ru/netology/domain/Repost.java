package ru.netology.domain;

public class Repost {
    private String shareOnWall;
    private String shareInCommunity;
    private String shareInStory;
    private String shareInMessage;
    private String textComment;

    public String getShareOnWall() {
        return shareOnWall;
    }

    public void setShareOnWall(String shareOnWall) {
        this.shareOnWall = shareOnWall;
    }

    public String getShareInCommunity() {
        return shareInCommunity;
    }

    public void setShareInCommunity(String shareInCommunity) {
        this.shareInCommunity = shareInCommunity;
    }

    public String getShareInStory() {
        return shareInStory;
    }

    public void setShareInStory(String shareInStory) {
        this.shareInStory = shareInStory;
    }

    public String getShareInMessage() {
        return shareInMessage;
    }

    public void setShareInMessage(String shareInMessage) {
        this.shareInMessage = shareInMessage;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
}
