package org.javaee.web.hello.repository;

import org.javaee.web.hello.entity.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, String> {
	
}
