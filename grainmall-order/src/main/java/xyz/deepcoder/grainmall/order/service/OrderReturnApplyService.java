package xyz.deepcoder.grainmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.grainmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:38:46
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

