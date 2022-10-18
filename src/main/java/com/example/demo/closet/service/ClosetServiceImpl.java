package com.example.demo.closet.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.closet.dao.IClosetImgInfoDao;
import com.example.demo.closet.dao.IClosetInfoDao;
import com.example.demo.closet.dao.IConnectClosetImgDao;
import com.example.demo.closet.vo.ClosetImgInfoVo;
import com.example.demo.closet.vo.ClosetInfoVo;
import com.example.demo.closet.vo.ConnectClosetImgVo;

@Service
public class ClosetServiceImpl implements IClosetService{
	@Autowired
	IClosetImgInfoDao IClosetImgInfoDao;
	@Autowired
	IClosetInfoDao IClosetInfoDao;
	@Autowired
	IConnectClosetImgDao IConnectClosetImgDao;

	// 옷장 이미지 정보 업로드(추가)
	@Override
	public int ClosetImgInfoUploadDao(Map<String, String> map) {
		int upload = IClosetImgInfoDao.ClosetImgInfoUploadDao(map);
		return upload;
	}

	//----------------------------------------------------------
	// 옷장 정보 조회
	@Override
	public List<ClosetInfoVo> ClosetInfoAllListDao() {
		List<ClosetInfoVo> allList = IClosetInfoDao.ClosetInfoAllListDao();
		return allList;
	}

	// 옷장 정보 작성(추가)
	@Override
	public int ClosetInfoWrite(Map<String, String> map) {
		int write = IClosetInfoDao.ClosetInfoDeleteDao(map);
		return write;
	}

	// 옷장 정보 수정
	@Override
	public int ClosetInfoEditDao(Map<String, String> map) {
		int edit = IClosetInfoDao.ClosetInfoEditDao(map);
		return edit;
	}

	// 옷장 정보 삭제
	@Override
	public int ClosetInfoDeleteDao(Map<String, String> map) {
		int delete = IClosetInfoDao.ClosetInfoDeleteDao(map);
		return delete;
	}

	//----------------------------------------------------------
	// 옷장-이미지 정보 추가(post)
	@Override
	public int ConnectClosetImgPostDao(Map<String, String> map) {
		int post = IConnectClosetImgDao.ConnectClosetImgPostDao(map);
		return post;
	}

	// 옷장-이미지 정보 삭제
	@Override
	public int ConnectClosetImgDeleteDao(Map<String, String> map) {
		int delete = IConnectClosetImgDao.ConnectClosetImgDeleteDao(map);
		return delete;
	}

	// 옷장-이미지 정보 조회
	@Override
	public List<ConnectClosetImgVo> ConnectClosetImgAllListDao(Map<String, String> map) {
		List<ConnectClosetImgVo> allList = IConnectClosetImgDao.ConnectClosetImgAllListDao(map);
		return allList;
	}
}
