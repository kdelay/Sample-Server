package com.example.demo.closet.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.closet.vo.ClosetImgInfoVo;

@Mapper
public interface IClosetImgInfoDao {
	public List<ClosetImgInfoVo> ClosetImgInfoSearchDao(Map<String, String> map); // 모든 db 데이터
	
	public int ClosetImgInfoUploadDao(Map<String, String> map); // 옷 이미지 추가(작성)
}
