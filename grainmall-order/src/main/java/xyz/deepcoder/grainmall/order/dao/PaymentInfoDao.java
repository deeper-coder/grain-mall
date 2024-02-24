package xyz.deepcoder.grainmall.order.dao;

import xyz.deepcoder.grainmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:38:46
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
