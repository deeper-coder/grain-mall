package xyz.deepcoder.grainmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.grainmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:38:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

