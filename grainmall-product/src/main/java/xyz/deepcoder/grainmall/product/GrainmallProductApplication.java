package xyz.deepcoder.grainmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("xyz.deepcoder.grainmall.product.dao")
@SpringBootApplication
public class GrainmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallProductApplication.class, args);
    }

}
