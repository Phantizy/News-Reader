package com.example.newsreader;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class RSSFeed {

    private String title = null;
    private String pubDate = null;
    private ArrayList<RSSItem> items;

    private SimpleDateFormat dateInFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z");

    public RSSFeed(){
        items = new ArrayList<RSSItem>();
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<RSSItem> getAllItems() {
        return items;
    }

    public RSSItem getItem(int position) {
        return items.get(position);
    }

    public String getPubDate() {
        return pubDate;
    }

    public void addItem(RSSItem item) {
        items.add(item);
    }

    public void setPubDate(String s) {
        this.pubDate = s;
    }
}
