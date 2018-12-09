package com.windingroad.tistory.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class JournalEntry {

    private String  title;
    private String  created;
    private String  summary;

//    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public JournalEntry(String title, String summary, String date)
            throws ParseException {
        this.title = title;
        this.summary = summary;
        this.created = date;
    }

    JournalEntry() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String date) throws ParseException {

    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String toString() {
        StringBuilder value = new StringBuilder("* JournalEntry(");
        value.append("제목: ");
        value.append(title);
        value.append(",요약: ");
        value.append(summary);
        value.append(",작성일자: ");
        value.append(created);
        value.append(")");
        return value.toString();
    }
}
