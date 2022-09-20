package com.example.demo.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.base.dao.ISampleDao;
import com.example.demo.base.vo.SampleVo;

@Service
public class SampleServiceImpl implements ISampleService{
	@Autowired
	ISampleDao dao;

	@Override
	public List<SampleVo> list() {
		List<SampleVo> list = dao.listDao();
		return list;
	}

	

}