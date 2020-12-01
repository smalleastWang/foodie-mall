package com.smalleast.mapper;

import com.smalleast.BaseMapper;
import com.smalleast.pojo.Items;

public interface ItemsMapper extends BaseMapper<Items> {
    Items queryItemById(String id);
}