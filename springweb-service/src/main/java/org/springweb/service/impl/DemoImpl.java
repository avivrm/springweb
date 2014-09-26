package org.springweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springweb.data.DemoRepositoryI;
import org.springweb.service.DemoI;

@Service
public class DemoImpl implements DemoI {

	@Autowired
	DemoRepositoryI demoRepositoryI;

	public DemoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String demo() {
		return demoRepositoryI.demo();
	}

}
