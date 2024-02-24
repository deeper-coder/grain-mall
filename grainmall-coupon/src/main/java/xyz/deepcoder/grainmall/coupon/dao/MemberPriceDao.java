package xyz.deepcoder.grainmall.coupon.dao;

import xyz.deepcoder.grainmall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 17:15:38
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
