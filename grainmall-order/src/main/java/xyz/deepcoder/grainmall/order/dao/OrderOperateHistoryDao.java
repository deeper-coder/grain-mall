package xyz.deepcoder.grainmall.order.dao;

import xyz.deepcoder.grainmall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:38:46
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
