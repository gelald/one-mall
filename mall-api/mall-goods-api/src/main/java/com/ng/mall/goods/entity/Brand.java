package com.ng.mall.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: WuYingBin
 * date: 2021/12/13
 * 品牌表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "brand")
public class Brand {
    /**
     * 品牌主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 品牌图片地址
     */
    private String image;
    /**
     * 品牌首字母
     */
    private String initial;
    /**
     * 排序号
     */
    private Integer sort;
}
