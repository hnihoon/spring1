package day4.service;

import org.springframework.stereotype.Component;

import day4.dto.BookDto;
import day4.mapper.BookMapper;

@Component
public class BookService {
	private BookMapper mapper;
	
	public BookService(BookMapper mapper) {
		this.mapper=mapper;
	}
	
	public void insert(BookDto dto) {
		mapper.insert(dto);
	}
}
