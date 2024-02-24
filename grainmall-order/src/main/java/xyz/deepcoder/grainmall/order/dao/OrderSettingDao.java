package xyz.deepcoder.grainmall.order.dao;

import xyz.deepcoder.grainmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:38:46
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
