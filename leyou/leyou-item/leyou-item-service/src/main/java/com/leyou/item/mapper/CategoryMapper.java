package com.leyou.item.mapper;


import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;
import  com.leyou.item.pojo.Category;
public interface CategoryMapper extends Mapper<Category>,SelectByIdListMapper<Category,Long> {
}