package com.aem.micro;

import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aem.micro.controller.ExchangeValue;
import com.aem.micro.repository.ExchangeValueRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMicroBusinessRemotingApplicationTests {

	@Autowired
	ExchangeValueRepository repository;

	@Test
	public void contextLoads() {

		List<ExchangeValue> exchangeValueRepositories = repository.findAll();
		System.err.println(exchangeValueRepositories);
		System.err.println(repository.test(102l));

		HashSet<String> xyz = new HashSet<>();
		xyz.add("x");
		xyz.add("y");
		xyz.add("z");
		HashSet<String> pqr = new HashSet<>();
		pqr.add("xx");
		pqr.add("yy");
		pqr.add("zz");
		
		List<ExchangeValue> exchangeValues = repository.test2(xyz, pqr);
		System.err.println(exchangeValues);

	}

}
