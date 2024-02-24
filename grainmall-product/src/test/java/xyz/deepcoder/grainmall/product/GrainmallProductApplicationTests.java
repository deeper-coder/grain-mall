package xyz.deepcoder.grainmall.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.deepcoder.grainmall.product.entity.ProductAttrValueEntity;
import xyz.deepcoder.grainmall.product.service.ProductAttrValueService;

import javax.annotation.Resource;

@SpringBootTest
class GrainmallProductApplicationTests {
    @Resource
    ProductAttrValueService productAttrValueService;
    @Test
    void contextLoads() {
        ProductAttrValueEntity mac = ProductAttrValueEntity.builder().attrName("mac").attrValue("10000").build();
        productAttrValueService.save(mac);
    }

}
