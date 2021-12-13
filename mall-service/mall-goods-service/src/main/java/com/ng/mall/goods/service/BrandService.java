package com.ng.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ng.mall.goods.entity.Brand;

import java.util.List;

/**
 * @author: WuYingBin
 * date: 2021/12/13
 */
public interface BrandService extends IService<Brand> {
    /**
     * 条件查询
     *
     * @param brand 查询条件
     * @return 查询结果
     */
    List<Brand> queryList(Brand brand);

    /**
     * 条件分页查询
     *
     * @param brand       查询条件
     * @param currentPage 当前页码
     * @param size        每一页数据条数
     * @return 查询结果
     */
    Page<Brand> queryPageList(Brand brand, Long currentPage, Long size);
}
