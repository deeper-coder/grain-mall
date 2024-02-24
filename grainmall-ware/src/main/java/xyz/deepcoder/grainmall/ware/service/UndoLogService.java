package xyz.deepcoder.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.deepcoder.common.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author pluto
 * @email 386209378@qq.com
 * @date 2024-02-24 19:46:57
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

