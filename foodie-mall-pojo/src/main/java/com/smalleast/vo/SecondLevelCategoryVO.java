package com.smalleast.vo;

import java.util.List;

/**
 * 二级分类VO, 数据库查询并封装之后传递给视图层
 * @Author : wangxiaodong
 * @Program : com.smalleast.vo
 * @Description : TODO
 * @Date 2020/11/30 下午12:44
 **/

public class SecondLevelCategoryVO {

    /**
     * 二级分类id
     */
    private Integer id;
    /**
     * 二级分类名
     */
    private String name;
    /**
     * 二级分类类型
     */
    private Integer type;
    /**
     * 二级分类所属一级分类id
     */
    private Integer fatherId;

    /**
     * 二级分类下属三级分类列表
     */
    List<ThreeLevelCategoryVO> subCatList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public List<ThreeLevelCategoryVO> getSubCatList() {
        return subCatList;
    }

    public void setSubCatList(List<ThreeLevelCategoryVO> subCatList) {
        this.subCatList = subCatList;
    }

    @Override
    public String toString() {
        return "SecondLevelCategoryVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", fatherId=" + fatherId +
                ", subCatList=" + subCatList +
                '}';
    }
}
