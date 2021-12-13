package com.ng.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ng.mall.goods.entity.Brand;
import com.ng.mall.goods.service.BrandService;
import com.ng.mall.util.RespResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: WuYingBin
 * date: 2021/12/13
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public RespResult<?> add(@RequestBody Brand brand) {
        this.brandService.save(brand);
        return RespResult.ok();
    }

    @PutMapping
    public RespResult<?> update(@RequestBody Brand brand) {
        this.brandService.updateById(brand);
        return RespResult.ok();
    }

    @DeleteMapping("/{id}")
    public RespResult<?> delete(@PathVariable String id) {
        this.brandService.removeById(id);
        return RespResult.ok();
    }

    @PostMapping("/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand) {
        List<Brand> brands = this.brandService.queryList(brand);
        return RespResult.ok(brands);
    }

    @PostMapping("/search/{page}/{size}")
    public RespResult<Page<Brand>> queryPageList(@RequestBody Brand brand, @PathVariable Long page, @PathVariable Long size) {
        Page<Brand> brands = this.brandService.queryPageList(brand, page, size);
        return RespResult.ok(brands);
    }
}
