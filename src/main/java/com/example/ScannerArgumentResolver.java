package com.example;

import java.io.InputStream;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ScannerArgumentResolver implements ArgumentResolver {

	@Override
	public Argument resolve(InputStream stream) {
		Scanner scanner = new Scanner(stream);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		return new Argument(a,b);
	}

}
