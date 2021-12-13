package com.ng.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ng.mall.goods.entity.Brand;
import com.ng.mall.goods.mapper.BrandMapper;
import com.ng.mall.goods.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: WuYingBin
 * date: 2021/12/13
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
    @Override
    public List<Brand> queryList(Brand brand) {
        // 条件包装对象
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();
        // 根据name查询
        queryWrapper.like("name", brand.getName());
        // 根据initial查询
        queryWrapper.eq("initial", brand.getInitial());
        return this.getBaseMapper().selectList(queryWrapper);
    }

    @Override
    public Page<Brand> queryPageList(Brand brand, Long currentPage, Long size) {
        // 条件包装对象
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();
        // 根据name查询
        queryWrapper.like("name", brand.getName());
        // 根据initial查询
        queryWrapper.eq("initial", brand.getInitial());
        return this.getBaseMapper().selectPage(new Page<>(currentPage, size), queryWrapper);
    }
}
