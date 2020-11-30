package com.smalleast.service.impl;

import com.smalleast.enums.CategoryType;
import com.smalleast.mapper.CategoryMapper;
import com.smalleast.pojo.Carousel;
import com.smalleast.pojo.Category;
import com.smalleast.service.CategoryService;
import com.smalleast.vo.SecondLevelCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.service
 * @Description : TODO
 * @Date 2020/11/30 上午11:42
 **/

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    /**
     * 查询一级分类
     * @return
     */
    @Override
    public List<Category> queryRootCategoryList() {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("type", CategoryType.ONE.type);
        List<Category> result = categoryMapper.selectByExample(example);
        return result;
    }

    /**
     * 查询子分类
     * @return
     */
    @Override
    public List<SecondLevelCategoryVO> querySubCategoryList(Integer rootCatId) {
        List<SecondLevelCategoryVO> result = categoryMapper.queryCategoryByFatherId(rootCatId);
        return result;
    }
}
