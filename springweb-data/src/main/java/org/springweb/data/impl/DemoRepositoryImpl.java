package org.springweb.data.impl;

import org.springframework.stereotype.Repository;
import org.springweb.data.DemoRepositoryI;

/**
 * Hello world!
 *
 */
@Repository
public class DemoRepositoryImpl implements DemoRepositoryI {
	DemoRepositoryImpl() {
	}

	@Override
	public String demo() {
		// TODO Auto-generated method stub
		return "Sghfgh";
	}

}
