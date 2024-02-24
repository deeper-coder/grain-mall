package xyz.deepcoder.grainmall.member.dao;

import xyz.deepcoder.grainmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:31:07
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
