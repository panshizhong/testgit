package com.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.www.mapper.MessageMapper;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageMapper mapper;
	@Transactional
	@Override
	public String findMsg(Integer id) {
		return mapper.selectMsg(id);
	}
}
