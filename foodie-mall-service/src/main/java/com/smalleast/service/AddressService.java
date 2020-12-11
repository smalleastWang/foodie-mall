package com.smalleast.service;

import com.smalleast.bo.AddressSearchBo;
import com.smalleast.pojo.UserAddress;

import java.util.List;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.service.impl
 * @Description : TODO
 * @Date 2020/12/11 下午9:39
 **/

public interface AddressService {
    public List<UserAddress> queryAddressList(AddressSearchBo addressSearchBo);
}
