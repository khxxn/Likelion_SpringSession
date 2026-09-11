package com.likelionhw.springhw.guestbook.repository;

import com.likelionhw.springhw.guestbook.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestbookRepository extends JpaRepository<Guestbook, Long> {

}
