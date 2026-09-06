package com.likelionhw.springhw.Repository;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepository {
    private final List<String> messages = new ArrayList<>();
    private int count = 0;
    public void save(String message){
        messages.add(message);
        count++;
    }
    public List<String> findAll(){
        return messages;
    }

    public int getCount() {
        return count;
    }
}
