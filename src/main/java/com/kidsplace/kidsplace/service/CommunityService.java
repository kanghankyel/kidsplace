package com.kidsplace.kidsplace.service;

import com.kidsplace.kidsplace.commons.NoticeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommunityService {

    // 공지사항 리스트 불러오기
    List<NoticeVO> noticeList();

    // 공지사항 항목 하나 불러오기(공지사항 보기)
    NoticeVO noticeRead(@Param("nNum") int nNum);

    // 공지사항 쓰기
    void noticeWrite(NoticeVO noticeVO);
}
