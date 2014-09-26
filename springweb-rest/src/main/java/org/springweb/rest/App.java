package org.springweb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springweb.service.DemoI;

/**
 * Hello world!
 *
 */
@Controller
public class App {

	@Autowired
	DemoI demoI;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	@ResponseBody
	public String main() {
		return demoI.demo();
	}
}
