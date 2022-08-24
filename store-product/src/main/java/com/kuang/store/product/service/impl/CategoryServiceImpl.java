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

import java.util.ArrayList;
import java.util.Collections;
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

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();

        //递归查询是否还有父节点
        List<Long> parentPath = findParentPath(catelogId, paths);

        //进行一个逆序排列
        Collections.reverse(parentPath);

        return (Long[]) parentPath.toArray(new Long[parentPath.size()]);
    }

    private List<Long> findParentPath(Long catelogId, List<Long> paths) {
        //1、收集当前节点id
        paths.add(catelogId);

        //根据当前分类id查询信息
        CategoryEntity byId = this.getById(catelogId);
        //如果当前不是父分类
        if (byId.getParentCid() != 0) {
            findParentPath(byId.getParentCid(), paths);
        }

        return paths;
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