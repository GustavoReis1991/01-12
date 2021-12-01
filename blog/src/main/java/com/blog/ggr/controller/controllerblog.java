package com.blog.ggr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.ggr.model.modelblog;
import com.blog.ggr.repositorio.repositorioblog;

@RestController
@RequestMapping("/blog.ggr")
@CrossOrigin("*")

public class controllerblog {
	
	@Autowired
	private repositorioblog rg;
	
	@GetMapping
	public ResponseEntity<List<modelblog>> getAll(){
		return ResponseEntity.ok(rg.findAll());
	}

}
