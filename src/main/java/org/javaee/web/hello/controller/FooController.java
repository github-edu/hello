package org.javaee.web.hello.controller;

import java.util.List;

import org.javaee.web.hello.entity.Foo;
import org.javaee.web.hello.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/foo")
public class FooController {

	@Autowired
	private FooService service;
	
	@GetMapping("/say")
	public String sayFoo() {
		return service.sayFoo();
	}
	
	@GetMapping
	public List<Foo> getFooes() {
		return service.getFooes();
	}
	
}
