package com.mrhy.springbootmytest.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cooper
 * @description
 * @date 2023/2/11 18:32
 */
@RestController
public class TestController {



	@GetMapping("/test")
	public String getUserInfoById() {
		return "1";
	}

}
