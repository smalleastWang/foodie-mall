package com.smalleast;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
* 继承自己的MyMapper
*/
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
