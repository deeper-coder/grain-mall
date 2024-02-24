package xyz.deepcoder.grainmall.order.dao;

import xyz.deepcoder.grainmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:38:45
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
