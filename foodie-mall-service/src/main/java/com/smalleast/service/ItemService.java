package com.smalleast.service;

import com.smalleast.bo.ItemCreateBo;
import com.smalleast.bo.ItemSearchBo;
import com.smalleast.pojo.Items;

import java.util.List;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.service
 * @Description : TODO
 * @Date 2020/11/24 下午5:58
 **/
public interface ItemService {

    /**
     * 获取商品列表
     * @param itemSearchBo
     * @return items[]
     */
    public List<Items> queryItems(ItemSearchBo itemSearchBo);

    /**
     * 添加商品列表
     * @param ItemCreateBo
     * @return  items
     */
    public Items createItem(ItemCreateBo ItemCreateBo);

    /**
     * 查询首页分类推荐商品
     * @param rootCategoryId
     * @return
     */
    List<Items> queryItemsByCategory(Integer rootCategoryId);

}
