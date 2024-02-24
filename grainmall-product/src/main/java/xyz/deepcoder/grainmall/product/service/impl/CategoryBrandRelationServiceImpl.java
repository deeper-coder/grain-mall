package xyz.deepcoder.grainmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.deepcoder.common.utils.PageUtils;
import xyz.deepcoder.common.utils.Query;
import xyz.deepcoder.grainmall.product.dao.CategoryBrandRelationDao;
import xyz.deepcoder.grainmall.product.entity.CategoryBrandRelationEntity;
import xyz.deepcoder.grainmall.product.service.CategoryBrandRelationService;

import java.util.Map;


@Service("categoryBrandRelationService")
public class CategoryBrandRelationServiceImpl extends ServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity> implements CategoryBrandRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBrandRelationEntity> page = this.page(
                new Query<CategoryBrandRelationEntity>().getPage(params),
                new QueryWrapper<CategoryBrandRelationEntity>()
        );

        return new PageUtils(page);
    }

}