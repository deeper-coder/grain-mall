package xyz.deepcoder.grainmall.member.dao;

import xyz.deepcoder.grainmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:31:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
