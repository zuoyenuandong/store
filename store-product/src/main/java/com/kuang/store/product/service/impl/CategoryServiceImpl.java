package com.kuang.store.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kuang.common.utils.PageUtils;
import com.kuang.common.utils.Query;
import com.kuang.store.product.dao.CategoryDao;
import com.kuang.store.product.entity.CategoryEntity;
import com.kuang.store.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);

        return entities.stream()
                .filter(categoryEntity ->categoryEntity.getParentCid() == 0)
                .map(levelOne->{levelOne.setChildren(getChildren(levelOne,entities));return levelOne;})
                .sorted((categoryEntity1, categoryEntity2) -> {
                    return (categoryEntity1.getSort()==null?0:categoryEntity1.getSort()) - (categoryEntity2.getSort()==null?0:categoryEntity2.getSort());
                })
                .collect(Collectors.toList());

    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查引用
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        return all.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId())
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted((categoryEntity1, categoryEntity2) -> {
                    return (categoryEntity1.getSort()==null?0:categoryEntity1.getSort()) - (categoryEntity2.getSort()==null?0:categoryEntity2.getSort());
                })
                .collect(Collectors.toList());
    }

}