package com.smalleast.service.impl;

import com.smalleast.mapper.CarouselMapper;
import com.smalleast.pojo.Carousel;
import com.smalleast.service.CarouselService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;

    @Override
    public List<Carousel> queryAll(Integer isShow) {
        Example example = new Example(Carousel.class);
        example.orderBy("sort").desc(); // .asc() 正序 desc() 倒序
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("isShow", isShow);
        List<Carousel> result = carouselMapper.selectByExample(example);
        return result;
    }
}
