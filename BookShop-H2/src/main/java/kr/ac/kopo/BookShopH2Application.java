package kr.ac.kopo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("kr.ac.kopo.bookshop.dao")
@SpringBootApplication
public class BookShopH2Application {

	public static void main(String[] args) {
		SpringApplication.run(BookShopH2Application.class, args);
	}

}
