package com.example.demo.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.base.vo.SampleVo;

@Mapper
public interface ISampleDao {
	public List<SampleVo> listDao();
}
