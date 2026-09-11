package com.likelionhw.springhw.guestbook.dto;

public class GuestbookResponse {
    final private String title;
    final private String writer;
    final private String ps;

    public GuestbookResponse(String title, String writer, String ps) {
        this.title = title;
        this.writer = writer;
        this.ps = ps;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getPs() {
        return ps;
    }
}
