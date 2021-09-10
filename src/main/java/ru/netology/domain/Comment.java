package ru.netology.domain;

public class Comment {
    private String logoImageUrl;
    private String text;
    private String addFile;
    private String addPhoto;
    private String chooseSmile;
    private String sendComment;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }

    public String getAddFile() {
        return addFile;
    }

    public void setAddFile(String addFile) {
        this.addFile = addFile;
    }

    public String getAddPhoto() {
        return addPhoto;
    }

    public void setAddPhoto(String addPhoto) {
        this.addPhoto = addPhoto;
    }

    public String getChooseSmile() {
        return chooseSmile;
    }

    public void setChooseSmile(String chooseSmile) {
        this.chooseSmile = chooseSmile;
    }

    public String getSendComment() {
        return sendComment;
    }

    public void setSendComment(String sendComment) {
        this.sendComment = sendComment;
    }
}
