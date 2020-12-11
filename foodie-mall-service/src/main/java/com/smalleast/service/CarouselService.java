package com.smalleast.service;

import com.smalleast.pojo.Carousel;

import java.util.List;

public interface CarouselService {
    /**
     * 查询轮播图
     * @param isShow
     * @return Carousel[]
     */
    public List<Carousel> queryAll(Integer isShow);
}
