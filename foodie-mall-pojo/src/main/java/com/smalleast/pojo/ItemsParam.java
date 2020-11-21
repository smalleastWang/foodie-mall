package com.smalleast.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "items_param")
public class ItemsParam {
    /**
     * 商品参数ID
     */
    private String id;

    /**
     * 商品外键ID
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 产地
     */
    @Column(name = "produc_place")
    private String producPlace;

    /**
     * 保质期
     */
    @Column(name = "foot_period")
    private String footPeriod;

    /**
     * 品牌名
     */
    private String brand;

    /**
     * 生产厂名
     */
    @Column(name = "factory_name")
    private String factoryName;

    /**
     * 生产地址
     */
    @Column(name = "factory_address")
    private String factoryAddress;

    /**
     * 包装方式
     */
    @Column(name = "packaging_method")
    private String packagingMethod;

    /**
     * 规格重量
     */
    private String weight;

    /**
     * 存储方法
     */
    @Column(name = "storage_method")
    private String storageMethod;

    /**
     * 食用方法
     */
    @Column(name = "eat_method")
    private String eatMethod;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取商品参数ID
     *
     * @return id - 商品参数ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置商品参数ID
     *
     * @param id 商品参数ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商品外键ID
     *
     * @return item_id - 商品外键ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品外键ID
     *
     * @param itemId 商品外键ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取产地
     *
     * @return produc_place - 产地
     */
    public String getProducPlace() {
        return producPlace;
    }

    /**
     * 设置产地
     *
     * @param producPlace 产地
     */
    public void setProducPlace(String producPlace) {
        this.producPlace = producPlace == null ? null : producPlace.trim();
    }

    /**
     * 获取保质期
     *
     * @return foot_period - 保质期
     */
    public String getFootPeriod() {
        return footPeriod;
    }

    /**
     * 设置保质期
     *
     * @param footPeriod 保质期
     */
    public void setFootPeriod(String footPeriod) {
        this.footPeriod = footPeriod == null ? null : footPeriod.trim();
    }

    /**
     * 获取品牌名
     *
     * @return brand - 品牌名
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌名
     *
     * @param brand 品牌名
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * 获取生产厂名
     *
     * @return factory_name - 生产厂名
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * 设置生产厂名
     *
     * @param factoryName 生产厂名
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    /**
     * 获取生产地址
     *
     * @return factory_address - 生产地址
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * 设置生产地址
     *
     * @param factoryAddress 生产地址
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress == null ? null : factoryAddress.trim();
    }

    /**
     * 获取包装方式
     *
     * @return packaging_method - 包装方式
     */
    public String getPackagingMethod() {
        return packagingMethod;
    }

    /**
     * 设置包装方式
     *
     * @param packagingMethod 包装方式
     */
    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod == null ? null : packagingMethod.trim();
    }

    /**
     * 获取规格重量
     *
     * @return weight - 规格重量
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置规格重量
     *
     * @param weight 规格重量
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * 获取存储方法
     *
     * @return storage_method - 存储方法
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * 设置存储方法
     *
     * @param storageMethod 存储方法
     */
    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod == null ? null : storageMethod.trim();
    }

    /**
     * 获取食用方法
     *
     * @return eat_method - 食用方法
     */
    public String getEatMethod() {
        return eatMethod;
    }

    /**
     * 设置食用方法
     *
     * @param eatMethod 食用方法
     */
    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod == null ? null : eatMethod.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}