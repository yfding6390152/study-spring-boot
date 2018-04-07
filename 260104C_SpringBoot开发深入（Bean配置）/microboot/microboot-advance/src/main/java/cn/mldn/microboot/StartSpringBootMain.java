package cn.mldn.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication	// 启动SpringBoot程序，而后自带子包扫描
@ImportResource(locations={"classpath:spring-common.xml"})
public class StartSpringBootMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartSpringBootMain.class, args);
    }
}
