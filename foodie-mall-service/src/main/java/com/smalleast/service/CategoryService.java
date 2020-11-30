package com.smalleast.service;

import com.smalleast.pojo.Category;
import com.smalleast.vo.SecondLevelCategoryVO;

import java.util.List;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.service
 * @Description : TODO
 * @Date 2020/11/30 上午11:45
 **/

public interface CategoryService {

    public List<Category> queryRootCategoryList();

    public List<SecondLevelCategoryVO> querySubCategoryList(Integer rootCatId);

}
