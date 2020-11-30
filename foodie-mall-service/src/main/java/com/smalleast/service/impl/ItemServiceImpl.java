package com.smalleast.service.impl;

import com.smalleast.bo.ItemCreateBo;
import com.smalleast.bo.ItemSearchBo;
import com.smalleast.enums.CategoryType;
import com.smalleast.mapper.ItemsMapper;
import com.smalleast.pojo.Category;
import com.smalleast.pojo.Items;
import com.smalleast.service.ItemService;
import org.n3r.idworker.Sid;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.service.impl
 * @Description : TODO
 * @Date 2020/11/24 下午5:59
 **/

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    ItemsMapper itemsMapper;

    @Resource
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Items> queryItems(ItemSearchBo itemSearchBo) {
        Items items = new Items();
        // 拷贝类
        BeanUtils.copyProperties(itemSearchBo, items);
        return itemsMapper.select(items);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Items createItem(ItemCreateBo itemCreateBo) {
        Items items = new Items();

        // 拷贝类
        BeanUtils.copyProperties(itemCreateBo, items);
        // 设置 ID
        items.setId(sid.nextShort());
        items.setCreateTime(new Date());
        items.setUpdatedTime(new Date());
        itemsMapper.insert(items);
        return items;
    }

    @Override
    public List<Items> queryItemsByCategory(Integer rootCategoryId) {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("root_cat_id", rootCategoryId);
        List<Items> result = itemsMapper.selectByExample(example);
        return result;
    }

}
