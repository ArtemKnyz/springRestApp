package com.spring.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataBase {
    private Map<Integer, bookDao> dataBase;

    public DataBase() {
        dataBase = new HashMap<>();
    }

    public void putBook(bookDao bookDao) {
        if (dataBase.isEmpty()) {
            dataBase.put(1, bookDao);
        } else {
            dataBase.put(dataBase.size() + 1, bookDao);
        }
    }

    public int getNumberOfBook() {
        return dataBase.size();
    }
}
