package com.smalleast.pojo;

import java.util.Date;
import javax.persistence.*;

public class Items {
    /**
     * 商品主键
     */
    @Id
    private String id;

    /**
     * 商品名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 分类外键ID
     */
    @Column(name = "cat_id")
    private String catId;

    /**
     * 一级分类外键ID
     */
    @Column(name = "root_cat_id")
    private String rootCatId;

    /**
     * 累计销售
     */
    @Column(name = "sell_counts")
    private Integer sellCounts;

    /**
     * 上下架状态
     */
    @Column(name = "on_off_status")
    private Integer onOffStatus;

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
     * 商品内容
     */
    private String content;

    /**
     * 获取商品主键
     *
     * @return id - 商品主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置商品主键
     *
     * @param id 商品主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商品名称
     *
     * @return item_name - 商品名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置商品名称
     *
     * @param itemName 商品名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * 获取分类外键ID
     *
     * @return cat_id - 分类外键ID
     */
    public String getCatId() {
        return catId;
    }

    /**
     * 设置分类外键ID
     *
     * @param catId 分类外键ID
     */
    public void setCatId(String catId) {
        this.catId = catId == null ? null : catId.trim();
    }

    /**
     * 获取一级分类外键ID
     *
     * @return root_cat_id - 一级分类外键ID
     */
    public String getRootCatId() {
        return rootCatId;
    }

    /**
     * 设置一级分类外键ID
     *
     * @param rootCatId 一级分类外键ID
     */
    public void setRootCatId(String rootCatId) {
        this.rootCatId = rootCatId == null ? null : rootCatId.trim();
    }

    /**
     * 获取累计销售
     *
     * @return sell_counts - 累计销售
     */
    public Integer getSellCounts() {
        return sellCounts;
    }

    /**
     * 设置累计销售
     *
     * @param sellCounts 累计销售
     */
    public void setSellCounts(Integer sellCounts) {
        this.sellCounts = sellCounts;
    }

    /**
     * 获取上下架状态
     *
     * @return on_off_status - 上下架状态
     */
    public Integer getOnOffStatus() {
        return onOffStatus;
    }

    /**
     * 设置上下架状态
     *
     * @param onOffStatus 上下架状态
     */
    public void setOnOffStatus(Integer onOffStatus) {
        this.onOffStatus = onOffStatus;
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

    /**
     * 获取商品内容
     *
     * @return content - 商品内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置商品内容
     *
     * @param content 商品内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}