package com.example.demo.closet.service;

import java.util.List;
import java.util.Map;

import com.example.demo.closet.vo.ClosetImgInfoVo;
import com.example.demo.closet.vo.ClosetInfoVo;
import com.example.demo.closet.vo.ConnectClosetImgVo;

public interface IClosetService {
	// IClosetImgInfoDao - 옷장 이미지 정보
	public int ClosetImgInfoUploadDao(Map<String, String> map); // 옷 이미지 추가(작성)
	
	// IClosetInfoDao - 옷장 정보
	public List<ClosetInfoVo> ClosetInfoAllListDao();
	public int ClosetInfoWrite(Map<String, String> map); // 옷 정보 작성
	public int ClosetInfoEditDao(Map<String, String> map); // 옷 정보 수정
	public int ClosetInfoDeleteDao(Map<String, String> map); // 옷 정보 삭제
	
	// IConnectClosetImgDao - 옷,이미지 연결 테이블
	public int ConnectClosetImgPostDao(Map<String, String> map);
	public int ConnectClosetImgDeleteDao(Map<String, String> map);
	
	public List<ConnectClosetImgVo> ConnectClosetImgAllListDao(Map<String, String> map);
}
