package xyz.deepcoder.grainmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.grainmall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:31:08
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

