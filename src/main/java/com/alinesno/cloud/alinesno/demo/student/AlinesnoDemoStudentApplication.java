package com.alinesno.cloud.alinesno.demo.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import com.alinesno.cloud.common.web.enable.EnableLogin;

/**
 * 启动入口
 *
 * @author ${author}
 * @sine 2019-10-07 22:10:67
 */
@EnableJpaAuditing
@SpringBootApplication
@EnableLogin
public class AlinesnoDemoStudentApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlinesnoDemoStudentApplication.class, args);
	}
}

