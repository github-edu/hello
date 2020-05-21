package org.javaee.web.hello.service;

import java.util.List;

import org.javaee.web.hello.entity.Foo;
import org.javaee.web.hello.repository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService {
	
	@Autowired
	private FooRepository repository;

	public String sayFoo() {
		System.out.println("sayFoo");
		return "Foo " + System.currentTimeMillis();
	}
	
	public List<Foo> getFooes() {
		return repository.findAll();
	}
	
}
