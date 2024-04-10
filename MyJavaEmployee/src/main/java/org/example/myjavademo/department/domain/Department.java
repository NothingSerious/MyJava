package org.example.myjavademo.department.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 部门表
 * @TableName department
 */
@TableName(value ="department")
@Data
public class Department implements Serializable {
    /**
     * 
     */
    @TableId
    private Long id;

    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 部门编号
     */
    private String deptCode;

    /**
     * 部门级别
     */
    private Integer deptLevel;

    /**
     * 父级部门id
     */
    private Integer deptParentId;

    /**
     * 薪人薪事部门ID
     */
    private String xrxsDeptId;

    /**
     * 薪人薪事父级部门ID
     */
    private String xrxsParentDeptId;

    /**
     * 薪人薪事部门类型
     */
    private Integer xrxsDeptType;

    /**
     * 钉钉部门ID
     */
    private String dingDeptId;

    /**
     * 钉钉父级部门ID
     */
    private String dingParentDeptId;

    /**
     * 飞书部门Id
     */
    private String larkDeptId;

    /**
     * 飞书父级部门ID
     */
    private String larkParentDeptId;

    /**
     * 最后一次更新时间
     */
    private String lastUpdateTime;

    /**
     * 是否是成本中心
     */
    private Integer beCostCenter;

    /**
     * 是否是利润中心
     */
    private Integer beProfitCenter;

    /**
     * 状态 0 正常，-1 删除
     */
    private Integer status;

    /**
     * 薪人薪事部门负责人id
     */
    private String xrxsAdminId;

    /**
     * 部门编码路径
     */
    private String deptCodePath;

    /**
     * 部门负责人ID(对应用户接口userid)
     */
    private Integer deptLeaderId;

    /**
     * 成本中心部门编号
     */
    private String costCenterDeptCode;

    /**
     * 利润中心部门编号
     */
    private String profitCenterDeptCode;

    /**
     * 成本中心编码
     */
    private String costCenterCode;

    /**
     * 利润中心编码
     */
    private String profitCenterCode;

    /**
     * 父级部门编号
     */
    private String parentDeptCode;

    /**
     * 金蝶部门编码
     */
    private String kdDeptId;

    /**
     * 金蝶父部门编码
     */
    private String kdParentDeptId;

    /**
     * 数据月份
     */
    private String month;

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
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getDeptCode() == null ? other.getDeptCode() == null : this.getDeptCode().equals(other.getDeptCode()))
            && (this.getDeptLevel() == null ? other.getDeptLevel() == null : this.getDeptLevel().equals(other.getDeptLevel()))
            && (this.getDeptParentId() == null ? other.getDeptParentId() == null : this.getDeptParentId().equals(other.getDeptParentId()))
            && (this.getXrxsDeptId() == null ? other.getXrxsDeptId() == null : this.getXrxsDeptId().equals(other.getXrxsDeptId()))
            && (this.getXrxsParentDeptId() == null ? other.getXrxsParentDeptId() == null : this.getXrxsParentDeptId().equals(other.getXrxsParentDeptId()))
            && (this.getXrxsDeptType() == null ? other.getXrxsDeptType() == null : this.getXrxsDeptType().equals(other.getXrxsDeptType()))
            && (this.getDingDeptId() == null ? other.getDingDeptId() == null : this.getDingDeptId().equals(other.getDingDeptId()))
            && (this.getDingParentDeptId() == null ? other.getDingParentDeptId() == null : this.getDingParentDeptId().equals(other.getDingParentDeptId()))
            && (this.getLarkDeptId() == null ? other.getLarkDeptId() == null : this.getLarkDeptId().equals(other.getLarkDeptId()))
            && (this.getLarkParentDeptId() == null ? other.getLarkParentDeptId() == null : this.getLarkParentDeptId().equals(other.getLarkParentDeptId()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getBeCostCenter() == null ? other.getBeCostCenter() == null : this.getBeCostCenter().equals(other.getBeCostCenter()))
            && (this.getBeProfitCenter() == null ? other.getBeProfitCenter() == null : this.getBeProfitCenter().equals(other.getBeProfitCenter()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getXrxsAdminId() == null ? other.getXrxsAdminId() == null : this.getXrxsAdminId().equals(other.getXrxsAdminId()))
            && (this.getDeptCodePath() == null ? other.getDeptCodePath() == null : this.getDeptCodePath().equals(other.getDeptCodePath()))
            && (this.getDeptLeaderId() == null ? other.getDeptLeaderId() == null : this.getDeptLeaderId().equals(other.getDeptLeaderId()))
            && (this.getCostCenterDeptCode() == null ? other.getCostCenterDeptCode() == null : this.getCostCenterDeptCode().equals(other.getCostCenterDeptCode()))
            && (this.getProfitCenterDeptCode() == null ? other.getProfitCenterDeptCode() == null : this.getProfitCenterDeptCode().equals(other.getProfitCenterDeptCode()))
            && (this.getCostCenterCode() == null ? other.getCostCenterCode() == null : this.getCostCenterCode().equals(other.getCostCenterCode()))
            && (this.getProfitCenterCode() == null ? other.getProfitCenterCode() == null : this.getProfitCenterCode().equals(other.getProfitCenterCode()))
            && (this.getParentDeptCode() == null ? other.getParentDeptCode() == null : this.getParentDeptCode().equals(other.getParentDeptCode()))
            && (this.getKdDeptId() == null ? other.getKdDeptId() == null : this.getKdDeptId().equals(other.getKdDeptId()))
            && (this.getKdParentDeptId() == null ? other.getKdParentDeptId() == null : this.getKdParentDeptId().equals(other.getKdParentDeptId()))
            && (this.getMonth() == null ? other.getMonth() == null : this.getMonth().equals(other.getMonth()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDeptCode() == null) ? 0 : getDeptCode().hashCode());
        result = prime * result + ((getDeptLevel() == null) ? 0 : getDeptLevel().hashCode());
        result = prime * result + ((getDeptParentId() == null) ? 0 : getDeptParentId().hashCode());
        result = prime * result + ((getXrxsDeptId() == null) ? 0 : getXrxsDeptId().hashCode());
        result = prime * result + ((getXrxsParentDeptId() == null) ? 0 : getXrxsParentDeptId().hashCode());
        result = prime * result + ((getXrxsDeptType() == null) ? 0 : getXrxsDeptType().hashCode());
        result = prime * result + ((getDingDeptId() == null) ? 0 : getDingDeptId().hashCode());
        result = prime * result + ((getDingParentDeptId() == null) ? 0 : getDingParentDeptId().hashCode());
        result = prime * result + ((getLarkDeptId() == null) ? 0 : getLarkDeptId().hashCode());
        result = prime * result + ((getLarkParentDeptId() == null) ? 0 : getLarkParentDeptId().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getBeCostCenter() == null) ? 0 : getBeCostCenter().hashCode());
        result = prime * result + ((getBeProfitCenter() == null) ? 0 : getBeProfitCenter().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getXrxsAdminId() == null) ? 0 : getXrxsAdminId().hashCode());
        result = prime * result + ((getDeptCodePath() == null) ? 0 : getDeptCodePath().hashCode());
        result = prime * result + ((getDeptLeaderId() == null) ? 0 : getDeptLeaderId().hashCode());
        result = prime * result + ((getCostCenterDeptCode() == null) ? 0 : getCostCenterDeptCode().hashCode());
        result = prime * result + ((getProfitCenterDeptCode() == null) ? 0 : getProfitCenterDeptCode().hashCode());
        result = prime * result + ((getCostCenterCode() == null) ? 0 : getCostCenterCode().hashCode());
        result = prime * result + ((getProfitCenterCode() == null) ? 0 : getProfitCenterCode().hashCode());
        result = prime * result + ((getParentDeptCode() == null) ? 0 : getParentDeptCode().hashCode());
        result = prime * result + ((getKdDeptId() == null) ? 0 : getKdDeptId().hashCode());
        result = prime * result + ((getKdParentDeptId() == null) ? 0 : getKdParentDeptId().hashCode());
        result = prime * result + ((getMonth() == null) ? 0 : getMonth().hashCode());
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
        sb.append(", deptId=").append(deptId);
        sb.append(", deptName=").append(deptName);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", deptLevel=").append(deptLevel);
        sb.append(", deptParentId=").append(deptParentId);
        sb.append(", xrxsDeptId=").append(xrxsDeptId);
        sb.append(", xrxsParentDeptId=").append(xrxsParentDeptId);
        sb.append(", xrxsDeptType=").append(xrxsDeptType);
        sb.append(", dingDeptId=").append(dingDeptId);
        sb.append(", dingParentDeptId=").append(dingParentDeptId);
        sb.append(", larkDeptId=").append(larkDeptId);
        sb.append(", larkParentDeptId=").append(larkParentDeptId);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", beCostCenter=").append(beCostCenter);
        sb.append(", beProfitCenter=").append(beProfitCenter);
        sb.append(", status=").append(status);
        sb.append(", xrxsAdminId=").append(xrxsAdminId);
        sb.append(", deptCodePath=").append(deptCodePath);
        sb.append(", deptLeaderId=").append(deptLeaderId);
        sb.append(", costCenterDeptCode=").append(costCenterDeptCode);
        sb.append(", profitCenterDeptCode=").append(profitCenterDeptCode);
        sb.append(", costCenterCode=").append(costCenterCode);
        sb.append(", profitCenterCode=").append(profitCenterCode);
        sb.append(", parentDeptCode=").append(parentDeptCode);
        sb.append(", kdDeptId=").append(kdDeptId);
        sb.append(", kdParentDeptId=").append(kdParentDeptId);
        sb.append(", month=").append(month);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}