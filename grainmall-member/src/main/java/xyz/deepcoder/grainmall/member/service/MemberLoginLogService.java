package xyz.deepcoder.grainmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.grainmall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:31:07
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

