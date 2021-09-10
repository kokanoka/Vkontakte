package ru.netology.domain;

public class ExtraFeatures {
    private boolean report;
    private boolean addToBookmarks;

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public boolean isAddToBookmarks() {
        return addToBookmarks;
    }

    public void setAddToBookmarks(boolean addToBookmarks) {
        this.addToBookmarks = addToBookmarks;
    }
}
