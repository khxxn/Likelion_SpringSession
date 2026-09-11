package com.likelionhw.springhw.guestbook.service;

import com.likelionhw.springhw.guestbook.dto.GuestbookResponse;
import com.likelionhw.springhw.guestbook.entity.Guestbook;
import com.likelionhw.springhw.guestbook.repository.GuestbookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestbookService {
    private final GuestbookRepository guestbookRepository;
    public GuestbookService(GuestbookRepository guestbookRepository){
        this.guestbookRepository = guestbookRepository;
    }
    public List<GuestbookResponse> getGuestbook() {
        List<Guestbook> guestbooks = guestbookRepository.findAll();
        List<GuestbookResponse> responses = new ArrayList<>();

        for(Guestbook guestbook : guestbooks){
            GuestbookResponse response = new GuestbookResponse(
                    guestbook.getTitle(),
                    guestbook.getWriter(),
                    guestbook.getPs()
            );
            responses.add(response);
        }
        return responses;

    }
}
