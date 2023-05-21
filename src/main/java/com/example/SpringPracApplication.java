package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.domain.Customer;
import com.example.domain.CustomerRepository;

@EnableAutoConfiguration
@ComponentScan
/**
 * CommandLineRunnerインターフェースを実装することでDIコンテナがインジェクションが可能になる
 *
 * @author RT2
 *
 */
public class SpringPracApplication implements CommandLineRunner {
	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringPracApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
		System.out.println(created);
		customerRepository.findAllOrderByName().forEach(System.out::println);
	}

}
