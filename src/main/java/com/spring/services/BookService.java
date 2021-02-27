package com.spring.services;

import com.spring.domain.DataBase;
import com.spring.domain.bookDao;
import com.spring.dto.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BookService {
    @Autowired
    private DataBase dataBase;

    public void createBook(CreateBookRequest createBookRequest) {
        bookDao bookDao = new bookDao(createBookRequest.getName(), createBookRequest.getAuthor());
        dataBase.putBook(bookDao);
    }

    public int getNumberOfBooks(){
        return dataBase.getNumberOfBook();
    }
}
