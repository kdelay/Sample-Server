package com.example.demo.closet.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.closet.vo.ConnectClosetImgVo;

@Mapper
public interface IConnectClosetImgDao {
	public int ConnectClosetImgPostDao(Map<String, String> map);
	public int ConnectClosetImgDeleteDao(Map<String, String> map);
	
	public List<ConnectClosetImgVo> ConnectClosetImgAllListDao(Map<String, String> map);
}
