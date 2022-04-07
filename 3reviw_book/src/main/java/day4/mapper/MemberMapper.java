package day4.mapper;

import java.util.List;
import java.util.Map;

import day4.dto.MemberDto;

public interface MemberMapper {
	void insert(MemberDto dto);
	List<MemberDto> selectAll();
	MemberDto selectOne(int mem_idx);
	MemberDto login(Map<String,String> map);
	
}
