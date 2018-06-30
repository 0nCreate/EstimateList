package com.oncreate.estimatelist.objects;

public class Cell {

    private long time;
    private boolean isLoading;

    Cell(long time, boolean isLoading){
        this.time = time;
        this.isLoading = isLoading;
    }

    public long getTime(){
        return time;
    }

    public boolean isLoading(){
        return isLoading;
    }
}
