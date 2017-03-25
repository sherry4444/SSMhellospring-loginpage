package com.test.dao;


import com.test.domain.Notice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 */
@Repository
public interface NoticeDao {

    List<Notice> findnoticeAll(Map<String, Object> parameter);
    int countNotice(@Param("title") String title);
    Notice addnotice(Notice notice);
 }
