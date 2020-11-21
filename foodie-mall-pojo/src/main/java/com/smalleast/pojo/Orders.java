package com.smalleast.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Orders {
    /**
     * 订单主键
     */
    @Id
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 收货人快照
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 收货人手机快照
     */
    @Column(name = "receiver_mobile")
    private Integer receiverMobile;

    /**
     * 收获地址快照
     */
    @Column(name = "receiver_address")
    private String receiverAddress;

    /**
     * 订单总价格
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 实际支付总价格
     */
    @Column(name = "real_pay_amount")
    private BigDecimal realPayAmount;

    /**
     * 邮费
     */
    @Column(name = "post_amount")
    private BigDecimal postAmount;

    /**
     * 支付方式
     */
    @Column(name = "pay_method")
    private Integer payMethod;

    /**
     * 买家留言
     */
    @Column(name = "left_msg")
    private String leftMsg;

    /**
     * 扩展字段
     */
    private String extand;

    /**
     * 买家是否评价
     */
    @Column(name = "is_comment")
    private Integer isComment;

    /**
     * 逻辑删除状态
     */
    @Column(name = "is_delete")
    private Integer isDelete;

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
     * 获取订单主键
     *
     * @return id - 订单主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置订单主键
     *
     * @param id 订单主键
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
     * 获取收货人快照
     *
     * @return receiver_name - 收货人快照
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人快照
     *
     * @param receiverName 收货人快照
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取收货人手机快照
     *
     * @return receiver_mobile - 收货人手机快照
     */
    public Integer getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置收货人手机快照
     *
     * @param receiverMobile 收货人手机快照
     */
    public void setReceiverMobile(Integer receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * 获取收获地址快照
     *
     * @return receiver_address - 收获地址快照
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置收获地址快照
     *
     * @param receiverAddress 收获地址快照
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * 获取订单总价格
     *
     * @return total_amount - 订单总价格
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置订单总价格
     *
     * @param totalAmount 订单总价格
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取实际支付总价格
     *
     * @return real_pay_amount - 实际支付总价格
     */
    public BigDecimal getRealPayAmount() {
        return realPayAmount;
    }

    /**
     * 设置实际支付总价格
     *
     * @param realPayAmount 实际支付总价格
     */
    public void setRealPayAmount(BigDecimal realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    /**
     * 获取邮费
     *
     * @return post_amount - 邮费
     */
    public BigDecimal getPostAmount() {
        return postAmount;
    }

    /**
     * 设置邮费
     *
     * @param postAmount 邮费
     */
    public void setPostAmount(BigDecimal postAmount) {
        this.postAmount = postAmount;
    }

    /**
     * 获取支付方式
     *
     * @return pay_method - 支付方式
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * 设置支付方式
     *
     * @param payMethod 支付方式
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取买家留言
     *
     * @return left_msg - 买家留言
     */
    public String getLeftMsg() {
        return leftMsg;
    }

    /**
     * 设置买家留言
     *
     * @param leftMsg 买家留言
     */
    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg == null ? null : leftMsg.trim();
    }

    /**
     * 获取扩展字段
     *
     * @return extand - 扩展字段
     */
    public String getExtand() {
        return extand;
    }

    /**
     * 设置扩展字段
     *
     * @param extand 扩展字段
     */
    public void setExtand(String extand) {
        this.extand = extand == null ? null : extand.trim();
    }

    /**
     * 获取买家是否评价
     *
     * @return is_comment - 买家是否评价
     */
    public Integer getIsComment() {
        return isComment;
    }

    /**
     * 设置买家是否评价
     *
     * @param isComment 买家是否评价
     */
    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    /**
     * 获取逻辑删除状态
     *
     * @return is_delete - 逻辑删除状态
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置逻辑删除状态
     *
     * @param isDelete 逻辑删除状态
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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