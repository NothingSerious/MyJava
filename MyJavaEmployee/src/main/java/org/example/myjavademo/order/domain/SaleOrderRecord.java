package org.example.myjavademo.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * kafka推送销售出库单记录
 * @TableName sale_order_record
 */
@TableName(value ="sale_order_record")
@Data
public class SaleOrderRecord implements Serializable {
    /**
     * 
     */
    @TableId
    private Long id;

    /**
     * 客户服务平台销售单id
     */
    private String sourceId;

    /**
     * 纷享逍客销售单id
     */
    private String fxSourceId;

    /**
     * 纷享逍客销售单编号
     */
    private String fxSourceNo;

    /**
     * 客户mini编码
     */
    private String clientCode;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 客户业务账户编码
     */
    private String businessAccountCode;

    /**
     * 网点编码
     */
    private String shopCode;

    /**
     * 网点名称
     */
    private String shopName;

    /**
     * 记录创建者user_master_id
     */
    private Long userMasterId;

    /**
     * 业务员
     */
    private String userName;

    /**
     * 业务员手机号
     */
    private String userPhone;

    /**
     * 发起人岗位
     */
    private String position;

    /**
     * 发起人作战分布id
     */
    private Integer deptSubId;

    /**
     * 发起人直属leaderId
     */
    private Long leaderId;

    /**
     * 发起人直属leader
     */
    private String leaderName;

    /**
     * 发起人直属leader岗位
     */
    private String leaderPosition;

    /**
     * 单据创建时间
     */
    private Date orderCreatedAt;

    /**
     * 单据修改时间
     */
    private Date orderUpdatedAt;

    /**
     * 发货时间
     */
    private Date orderShippedAt;

    /**
     * 价目表价格总价
     */
    private BigDecimal policyBookAmount;

    /**
     * 下单实际总价
     */
    private BigDecimal saleAmount;

    /**
     * 核销总价
     */
    private BigDecimal realAmount;

    /**
     * 订单类型 1常规订单 2费用签收条 3活动订单
     */
    private Integer recordType;

    /**
     * 客户业务类型 1-网点，2-批发商，3-分销商，4-经销商，5-重客系统，6-虚拟网点，7-总仓/大仓/自提仓
     */
    private Integer accountType;

    /**
     * 配送商编码
     */
    private String dispatchClientCode;

    /**
     * 配送商名称
     */
    private String dispatchClientName;

    /**
     * 下单物料-编码
     */
    private String materialNumber;

    /**
     * 下单物料-名称
     */
    private String materialName;

    /**
     * 下单物料-单位
     */
    private String materialUnit;

    /**
     * 物料大小单位转换系数
     */
    private Integer storeNumerator;

    /**
     * 销售数量
     */
    private Integer saleQty;

    /**
     * 基础单位数量
     */
    private Integer baseUnitQty;

    /**
     * 销售价格
     */
    private BigDecimal salePrice;

    /**
     * 核销价格
     */
    private BigDecimal realPrice;

    /**
     * 价目表价格
     */
    private BigDecimal policyBookPrice;

    /**
     * 1:常规销售商品(recordType=1或3)-常规订单的商品 【活动订单】和【常规订单】的常规商品属性(售价大于0);
2:常规赠品商品(recordType=1)-常规订单主动赠品 【常规订单】的赠品(售价为0);
3:活动赠货商品(recordType=3)-促销订单活动赠品  【活动订单】的赠品（售价为0）;
4:费用兑换商品(recordType=2)-费用签收条商品   【费用签收条】商品属性;
     */
    private Integer attributeType;

    /**
     * 活动编号
     */
    private String activityNo;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动类型
     */
    private String activityType;

    /**
     * 类别名称
     */
    private String categoryName;

    /**
     * 类别编码
     */
    private String categoryCode;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private Date updatedAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SaleOrderRecord other = (SaleOrderRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSourceId() == null ? other.getSourceId() == null : this.getSourceId().equals(other.getSourceId()))
            && (this.getFxSourceId() == null ? other.getFxSourceId() == null : this.getFxSourceId().equals(other.getFxSourceId()))
            && (this.getFxSourceNo() == null ? other.getFxSourceNo() == null : this.getFxSourceNo().equals(other.getFxSourceNo()))
            && (this.getClientCode() == null ? other.getClientCode() == null : this.getClientCode().equals(other.getClientCode()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getBusinessAccountCode() == null ? other.getBusinessAccountCode() == null : this.getBusinessAccountCode().equals(other.getBusinessAccountCode()))
            && (this.getShopCode() == null ? other.getShopCode() == null : this.getShopCode().equals(other.getShopCode()))
            && (this.getShopName() == null ? other.getShopName() == null : this.getShopName().equals(other.getShopName()))
            && (this.getUserMasterId() == null ? other.getUserMasterId() == null : this.getUserMasterId().equals(other.getUserMasterId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getDeptSubId() == null ? other.getDeptSubId() == null : this.getDeptSubId().equals(other.getDeptSubId()))
            && (this.getLeaderId() == null ? other.getLeaderId() == null : this.getLeaderId().equals(other.getLeaderId()))
            && (this.getLeaderName() == null ? other.getLeaderName() == null : this.getLeaderName().equals(other.getLeaderName()))
            && (this.getLeaderPosition() == null ? other.getLeaderPosition() == null : this.getLeaderPosition().equals(other.getLeaderPosition()))
            && (this.getOrderCreatedAt() == null ? other.getOrderCreatedAt() == null : this.getOrderCreatedAt().equals(other.getOrderCreatedAt()))
            && (this.getOrderUpdatedAt() == null ? other.getOrderUpdatedAt() == null : this.getOrderUpdatedAt().equals(other.getOrderUpdatedAt()))
            && (this.getOrderShippedAt() == null ? other.getOrderShippedAt() == null : this.getOrderShippedAt().equals(other.getOrderShippedAt()))
            && (this.getPolicyBookAmount() == null ? other.getPolicyBookAmount() == null : this.getPolicyBookAmount().equals(other.getPolicyBookAmount()))
            && (this.getSaleAmount() == null ? other.getSaleAmount() == null : this.getSaleAmount().equals(other.getSaleAmount()))
            && (this.getRealAmount() == null ? other.getRealAmount() == null : this.getRealAmount().equals(other.getRealAmount()))
            && (this.getRecordType() == null ? other.getRecordType() == null : this.getRecordType().equals(other.getRecordType()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getDispatchClientCode() == null ? other.getDispatchClientCode() == null : this.getDispatchClientCode().equals(other.getDispatchClientCode()))
            && (this.getDispatchClientName() == null ? other.getDispatchClientName() == null : this.getDispatchClientName().equals(other.getDispatchClientName()))
            && (this.getMaterialNumber() == null ? other.getMaterialNumber() == null : this.getMaterialNumber().equals(other.getMaterialNumber()))
            && (this.getMaterialName() == null ? other.getMaterialName() == null : this.getMaterialName().equals(other.getMaterialName()))
            && (this.getMaterialUnit() == null ? other.getMaterialUnit() == null : this.getMaterialUnit().equals(other.getMaterialUnit()))
            && (this.getStoreNumerator() == null ? other.getStoreNumerator() == null : this.getStoreNumerator().equals(other.getStoreNumerator()))
            && (this.getSaleQty() == null ? other.getSaleQty() == null : this.getSaleQty().equals(other.getSaleQty()))
            && (this.getBaseUnitQty() == null ? other.getBaseUnitQty() == null : this.getBaseUnitQty().equals(other.getBaseUnitQty()))
            && (this.getSalePrice() == null ? other.getSalePrice() == null : this.getSalePrice().equals(other.getSalePrice()))
            && (this.getRealPrice() == null ? other.getRealPrice() == null : this.getRealPrice().equals(other.getRealPrice()))
            && (this.getPolicyBookPrice() == null ? other.getPolicyBookPrice() == null : this.getPolicyBookPrice().equals(other.getPolicyBookPrice()))
            && (this.getAttributeType() == null ? other.getAttributeType() == null : this.getAttributeType().equals(other.getAttributeType()))
            && (this.getActivityNo() == null ? other.getActivityNo() == null : this.getActivityNo().equals(other.getActivityNo()))
            && (this.getActivityName() == null ? other.getActivityName() == null : this.getActivityName().equals(other.getActivityName()))
            && (this.getActivityType() == null ? other.getActivityType() == null : this.getActivityType().equals(other.getActivityType()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        result = prime * result + ((getFxSourceId() == null) ? 0 : getFxSourceId().hashCode());
        result = prime * result + ((getFxSourceNo() == null) ? 0 : getFxSourceNo().hashCode());
        result = prime * result + ((getClientCode() == null) ? 0 : getClientCode().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getBusinessAccountCode() == null) ? 0 : getBusinessAccountCode().hashCode());
        result = prime * result + ((getShopCode() == null) ? 0 : getShopCode().hashCode());
        result = prime * result + ((getShopName() == null) ? 0 : getShopName().hashCode());
        result = prime * result + ((getUserMasterId() == null) ? 0 : getUserMasterId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getDeptSubId() == null) ? 0 : getDeptSubId().hashCode());
        result = prime * result + ((getLeaderId() == null) ? 0 : getLeaderId().hashCode());
        result = prime * result + ((getLeaderName() == null) ? 0 : getLeaderName().hashCode());
        result = prime * result + ((getLeaderPosition() == null) ? 0 : getLeaderPosition().hashCode());
        result = prime * result + ((getOrderCreatedAt() == null) ? 0 : getOrderCreatedAt().hashCode());
        result = prime * result + ((getOrderUpdatedAt() == null) ? 0 : getOrderUpdatedAt().hashCode());
        result = prime * result + ((getOrderShippedAt() == null) ? 0 : getOrderShippedAt().hashCode());
        result = prime * result + ((getPolicyBookAmount() == null) ? 0 : getPolicyBookAmount().hashCode());
        result = prime * result + ((getSaleAmount() == null) ? 0 : getSaleAmount().hashCode());
        result = prime * result + ((getRealAmount() == null) ? 0 : getRealAmount().hashCode());
        result = prime * result + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getDispatchClientCode() == null) ? 0 : getDispatchClientCode().hashCode());
        result = prime * result + ((getDispatchClientName() == null) ? 0 : getDispatchClientName().hashCode());
        result = prime * result + ((getMaterialNumber() == null) ? 0 : getMaterialNumber().hashCode());
        result = prime * result + ((getMaterialName() == null) ? 0 : getMaterialName().hashCode());
        result = prime * result + ((getMaterialUnit() == null) ? 0 : getMaterialUnit().hashCode());
        result = prime * result + ((getStoreNumerator() == null) ? 0 : getStoreNumerator().hashCode());
        result = prime * result + ((getSaleQty() == null) ? 0 : getSaleQty().hashCode());
        result = prime * result + ((getBaseUnitQty() == null) ? 0 : getBaseUnitQty().hashCode());
        result = prime * result + ((getSalePrice() == null) ? 0 : getSalePrice().hashCode());
        result = prime * result + ((getRealPrice() == null) ? 0 : getRealPrice().hashCode());
        result = prime * result + ((getPolicyBookPrice() == null) ? 0 : getPolicyBookPrice().hashCode());
        result = prime * result + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        result = prime * result + ((getActivityNo() == null) ? 0 : getActivityNo().hashCode());
        result = prime * result + ((getActivityName() == null) ? 0 : getActivityName().hashCode());
        result = prime * result + ((getActivityType() == null) ? 0 : getActivityType().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", fxSourceId=").append(fxSourceId);
        sb.append(", fxSourceNo=").append(fxSourceNo);
        sb.append(", clientCode=").append(clientCode);
        sb.append(", clientName=").append(clientName);
        sb.append(", businessAccountCode=").append(businessAccountCode);
        sb.append(", shopCode=").append(shopCode);
        sb.append(", shopName=").append(shopName);
        sb.append(", userMasterId=").append(userMasterId);
        sb.append(", userName=").append(userName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", position=").append(position);
        sb.append(", deptSubId=").append(deptSubId);
        sb.append(", leaderId=").append(leaderId);
        sb.append(", leaderName=").append(leaderName);
        sb.append(", leaderPosition=").append(leaderPosition);
        sb.append(", orderCreatedAt=").append(orderCreatedAt);
        sb.append(", orderUpdatedAt=").append(orderUpdatedAt);
        sb.append(", orderShippedAt=").append(orderShippedAt);
        sb.append(", policyBookAmount=").append(policyBookAmount);
        sb.append(", saleAmount=").append(saleAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", recordType=").append(recordType);
        sb.append(", accountType=").append(accountType);
        sb.append(", dispatchClientCode=").append(dispatchClientCode);
        sb.append(", dispatchClientName=").append(dispatchClientName);
        sb.append(", materialNumber=").append(materialNumber);
        sb.append(", materialName=").append(materialName);
        sb.append(", materialUnit=").append(materialUnit);
        sb.append(", storeNumerator=").append(storeNumerator);
        sb.append(", saleQty=").append(saleQty);
        sb.append(", baseUnitQty=").append(baseUnitQty);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", realPrice=").append(realPrice);
        sb.append(", policyBookPrice=").append(policyBookPrice);
        sb.append(", attributeType=").append(attributeType);
        sb.append(", activityNo=").append(activityNo);
        sb.append(", activityName=").append(activityName);
        sb.append(", activityType=").append(activityType);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryCode=").append(categoryCode);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}