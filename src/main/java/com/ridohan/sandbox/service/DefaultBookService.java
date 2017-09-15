package com.ridohan.sandbox.service;


import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static  com.ridohan.sandbox.jooq.sandbox.tables.Book.BOOK;

@Service
public class DefaultBookService implements BookService{

    @Autowired
    DSLContext dsl;


    @Override
    @Transactional
    public void create(int id, int authorId, String title) {
        for(int i = 0;i < 2; i++){
            dsl.insertInto(BOOK).set(BOOK.AUTHOR_ID,authorId).set(BOOK.TITLE,title);
        }
    }
}
