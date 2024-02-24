package xyz.deepcoder.grainmall.coupon.dao;

import xyz.deepcoder.grainmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 17:15:38
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
