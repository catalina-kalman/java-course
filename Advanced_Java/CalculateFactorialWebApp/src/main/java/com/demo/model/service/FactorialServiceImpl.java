package com.demo.model.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialServiceImpl implements FactorialService {

	@Override
	public long calculateFactorial(int n) {
		long factorial = n;
		for (int i = 2 ; i < n ; i++)
			factorial = factorial * i;
		return factorial;
	}

}
