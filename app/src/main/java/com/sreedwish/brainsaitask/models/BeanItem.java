package com.sreedwish.brainsaitask.models;

public class BeanItem {

    String title;
    boolean show_progress = false;
    boolean selection_who = false;
    boolean selected = false;
    int progress = 30;


    public BeanItem(String title, boolean show_progress, boolean selection_who, boolean selected, int progress) {
        this.title = title;
        this.show_progress = show_progress;
        this.selection_who = selection_who;
        this.selected = selected;
        this.progress = progress;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShow_progress() {
        return show_progress;
    }

    public void setShow_progress(boolean show_progress) {
        this.show_progress = show_progress;
    }

    public boolean isSelection_who() {
        return selection_who;
    }

    public void setSelection_who(boolean selection_who) {
        this.selection_who = selection_who;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
