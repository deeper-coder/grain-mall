package xyz.deepcoder.grainmall.product.dao;

import xyz.deepcoder.grainmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-23 22:30:48
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
