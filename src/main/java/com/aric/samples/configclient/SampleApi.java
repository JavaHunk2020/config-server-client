/**
 * 
 */
package com.aric.samples.configclient;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TTDKOC
 *
 */
@RestController
@RequestMapping(path = "/api")
public class SampleApi {
	
	@Value("${jdbc.enabled:NoWorking}")
	private String aConf;
	
	@Value("${name.app}")
	private String appName;
	
	
	
	@PostConstruct
	public void peoeoe() {
		System.out.println("##############aConf = "+aConf);
		System.out.println("##############aConf = "+aConf);
		System.out.println("##############aConf = "+aConf);
		System.out.println("##############appName = "+appName);
		System.out.println("##############appName = "+appName);
		System.out.println("##############aConf = "+aConf);
		System.out.println("##############aConf = "+aConf);
		
	}
	
	@GetMapping
	public String getConf() {
		return this.aConf;
	}
}
