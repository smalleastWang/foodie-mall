package com.smalleast.service.impl;

import com.smalleast.mapper.CarouseMapper;
import com.smalleast.pojo.Carousel;
import com.smalleast.service.CarouselService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarouseServiceImpl implements CarouselService {
    @Resource
    private CarouseMapper carouseMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<Carousel> queryAll(Integer isShow) {
        Example example = new Example(Carousel.class);
        example.orderBy("sort").desc(); // .asc() 正序 desc() 倒序
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("isShow", isShow);
        List<Carousel> result = carouseMapper.selectByExample(example);
        return result;
    }

}
