package com.spring.aop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.aop.service.MessageService;


@RestController
@RequestMapping("/api/message")
public class MessageApi {

	@Autowired
	private MessageService MessageService;
@PostMapping("/goster")
public ResponseEntity<String> goster(@RequestBody String message){
	return ResponseEntity.ok(MessageService.mesajVer(message));
}
}

