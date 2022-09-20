package com.example.demo.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.service.ISampleService;
import com.example.demo.base.vo.SampleVo;

@RestController
public class SampleController {
	@Autowired
	ISampleService ISampleService;
	
	@GetMapping("/api/info")
	public String projectInfo() {
		return "Sample Project.";
	}
	
	@GetMapping("/api/list")
	public List<SampleVo> list() {
		List<SampleVo> list1 = ISampleService.list();
		return list1;
	}
}
