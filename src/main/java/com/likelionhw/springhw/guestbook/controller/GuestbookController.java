package com.likelionhw.springhw.guestbook.controller;

import com.likelionhw.springhw.guestbook.dto.GuestbookResponse;
import com.likelionhw.springhw.guestbook.entity.Guestbook;
import com.likelionhw.springhw.guestbook.repository.GuestbookRepository;
import com.likelionhw.springhw.guestbook.service.GuestbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestbookController {
    private final GuestbookService guestbookService;

    public GuestbookController(GuestbookService guestbookService){
        this.guestbookService = guestbookService;
    }
    @GetMapping("/api/guestbook")
    public List<GuestbookResponse> getGuestbook(){
        return guestbookService.getGuestbook();
    }

}
