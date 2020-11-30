package com.smalleast.mapper;

import com.smalleast.BaseMapper;
import com.smalleast.pojo.Category;
import com.smalleast.vo.SecondLevelCategoryVO;

import java.util.List;

public interface CategoryMapper extends BaseMapper<Category> {
    List<SecondLevelCategoryVO> queryCategoryByFatherId(Integer fatherId);
}