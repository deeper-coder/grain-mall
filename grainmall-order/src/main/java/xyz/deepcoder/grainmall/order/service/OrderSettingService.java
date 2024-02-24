package xyz.deepcoder.grainmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.grainmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:38:46
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

