package com.ninja.springboot_kubernities_eks_deployment_without_db;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@RequestMapping("/test")
public String test () {
	return " this is a kubernities deployment in eks by ec2";
}
}
