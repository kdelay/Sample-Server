package com.example.demo.closet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.closet.service.ClosetServiceImpl;
import com.example.demo.closet.service.IClosetService;

@RestController
public class ClosetController {
	@Autowired
	IClosetService IClosetService;
	
	// 페이지 샘플
	@GetMapping("/api/info")
	public String projectInfo() {
		return "Sample Project";
	}
	
	// 옷장 이미지 정보 업로드(추가)
	@PostMapping("/api/uploadcloset")
	public void upload(HttpServletRequest httpServletRequest, @RequestParam("img") MultipartFile img[]) {
	}
	
	//----------------------------------------------------------
	// 옷장 정보 조회
	
	// 옷장 정보 작성(추가)
	
	// 옷장 정보 수정
	
	// 옷장 정보 삭제
	
	//----------------------------------------------------------
	// 옷장-이미지 정보 추가(post)
	
	// 옷장-이미지 정보 삭제
	
	// 옷장-이미지 정보 조회
}
