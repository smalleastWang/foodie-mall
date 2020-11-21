package com.smalleast.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "items_comments")
public class ItemsComments {
    /**
     * 主键ID
     */
    @Id
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 商品ID
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 商品名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 商品规格ID
     */
    @Column(name = "item_spec_id")
    private String itemSpecId;

    /**
     * 商品规格名称
     */
    @Column(name = "item_sepc_name")
    private String itemSepcName;

    /**
     * 评价等级
     */
    @Column(name = "comment_level")
    private Integer commentLevel;

    /**
     * 评价内容
     */
    private String content;

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
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取商品ID
     *
     * @return item_id - 商品ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品ID
     *
     * @param itemId 商品ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
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
     * 获取商品规格ID
     *
     * @return item_spec_id - 商品规格ID
     */
    public String getItemSpecId() {
        return itemSpecId;
    }

    /**
     * 设置商品规格ID
     *
     * @param itemSpecId 商品规格ID
     */
    public void setItemSpecId(String itemSpecId) {
        this.itemSpecId = itemSpecId == null ? null : itemSpecId.trim();
    }

    /**
     * 获取商品规格名称
     *
     * @return item_sepc_name - 商品规格名称
     */
    public String getItemSepcName() {
        return itemSepcName;
    }

    /**
     * 设置商品规格名称
     *
     * @param itemSepcName 商品规格名称
     */
    public void setItemSepcName(String itemSepcName) {
        this.itemSepcName = itemSepcName == null ? null : itemSepcName.trim();
    }

    /**
     * 获取评价等级
     *
     * @return comment_level - 评价等级
     */
    public Integer getCommentLevel() {
        return commentLevel;
    }

    /**
     * 设置评价等级
     *
     * @param commentLevel 评价等级
     */
    public void setCommentLevel(Integer commentLevel) {
        this.commentLevel = commentLevel;
    }

    /**
     * 获取评价内容
     *
     * @return content - 评价内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评价内容
     *
     * @param content 评价内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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