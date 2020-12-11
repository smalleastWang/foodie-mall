package com.smalleast.service.impl;

import com.smalleast.bo.AddressSearchBo;
import com.smalleast.mapper.UserAddressMapper;
import com.smalleast.pojo.UserAddress;
import com.smalleast.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.service.impl
 * @Description : TODO
 * @Date 2020/12/11 下午9:41
 **/

@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> queryAddressList(AddressSearchBo addressSearchBo) {
        return null;
    }
}
