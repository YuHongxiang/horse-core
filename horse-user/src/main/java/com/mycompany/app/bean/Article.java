package com.mycompany.app.bean;

import java.sql.Timestamp;

/**
 * Created by sang on 2017/12/20.
 */
public class Article {
    private Long id;
    private String title;
    private String mdContent;
    private String htmlContent;
    private String summary;
    private Long cid;
    private Long uid;
    private Timestamp publishDate;
    private Integer state;
    private Integer pageView;
    private Timestamp editTime;
    private String[] dynamicTags;
    private String nickname;
    private String cateName;
//    private List<org.sang.bean.Tags> tags;
    private String stateStr;


}
