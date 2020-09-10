package com.example.demo.bean;

import java.sql.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sang on 2017/12/19.
 */
@Data
@NoArgsConstructor
public class Category {
    private Long id;
    private String cateName;
    private Timestamp date;
}
