package com.example.demo.base.vo;

import lombok.Data;

@Data
public class SampleVo {
//	외래키는 가져오지 않아도 된다.
	private String EMPNO       ;
	   private String ENAME     ;
	   private String JOB     ;
	   private String MGR        ;
	   private String HIREDATE   ;
	   private String SAL    ;
	   private String COMM    ;
}
