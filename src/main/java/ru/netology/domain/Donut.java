package ru.netology.domain;

public class Donut {
private boolean isDonut;
private int paidDuration;
private String placeholder;
private boolean canPublishFreeCopy;
private String editMode;

    public boolean isIsDonut() {
        return isDonut;
    }

    public void setIsDonut(boolean isDonut) {
        this.isDonut = isDonut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
