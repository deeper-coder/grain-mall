package xyz.deepcoder.grainmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.grainmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 17:15:38
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

