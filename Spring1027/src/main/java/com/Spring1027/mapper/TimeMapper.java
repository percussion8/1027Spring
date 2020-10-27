package com.Spring1027.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//sql구문 셀렉트문용 어노테이션
	@Select("select sysdate from dual") //@Select는 xml파일로 만들어서 사용하는것이 일반적인 방법
	public String getTime();
	
	public String getTime2(); //timemapper.xml에 sql문자열이 함수이름으로 선언되어있음. 그것을 get하는 메서드
}
