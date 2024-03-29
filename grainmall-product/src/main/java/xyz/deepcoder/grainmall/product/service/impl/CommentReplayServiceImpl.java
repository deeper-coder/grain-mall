package xyz.deepcoder.grainmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.common.utils.Query;
import xyz.deepcoder.grainmall.product.dao.CommentReplayDao;
import xyz.deepcoder.grainmall.product.entity.CommentReplayEntity;
import xyz.deepcoder.grainmall.product.service.CommentReplayService;

import java.util.Map;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}