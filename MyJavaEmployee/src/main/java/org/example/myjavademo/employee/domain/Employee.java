package org.example.myjavademo.employee.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 人员表
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 纷享user_master_id
     */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 身份证信息
     */
    private String idCardNumber;

    /**
     * 工号
     */
    private String employeeNo;

    /**
     * 员工id
     */
    private Integer employeeId;

    /**
     * 岗位
     */
    private String position;

    /**
     * 主部门的ID
     */
    private Integer deptId;

    /**
     * 部门编号
     */
    private String deptCode;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 上级的主ID
     */
    private Long leaderId;

    /**
     * 上级的名字
     */
    private String leaderName;

    /**
     * 钉钉ID
     */
    private String dingUserId;

    /**
     * 薪人薪事ID
     */
    private String xrxsUserId;

    /**
     * 薪人薪事汇报对象ID
     */
    private String xrxsLeaderId;

    /**
     * 薪人薪事岗位id
     */
    private String xrxsPositionId;

    /**
     * 飞书ID
     */
    private String larkUserId;

    /**
     * 最新就职状态 0:在职员工、1:离职员工、2:待入职、8:删除、10：待离职（注意：待离职本质上是在职）
     */
    private Integer status;

    /**
     * 入职日期 格式 YYYY-MM-DD
     */
    private String entryDate;

    /**
     * 离职日期 格式 YYYY-MM-DD
     */
    private String dismissionDate;

    /**
     * 最后一次更新时间
     */
    private String lastUpdateTime;

    /**
     * 聘用类型
     */
    private String hireType;

    /**
     * 公司主体
     */
    private String corpName;

    /**
     * 岗位编码
     */
    private String jobCode;

    /**
     * 部门ID列表
     */
    private String deptIdList;

    /**
     * 管理形式
     */
    private String managementForm;

    /**
     * 工作城市
     */
    private String workCity;

    /**
     * 人员类型 1我司，2共建
     */
    private Integer userType;

    /**
     * 月份 每月封版数据
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
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getIdCardNumber() == null ? other.getIdCardNumber() == null : this.getIdCardNumber().equals(other.getIdCardNumber()))
            && (this.getEmployeeNo() == null ? other.getEmployeeNo() == null : this.getEmployeeNo().equals(other.getEmployeeNo()))
            && (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getDeptCode() == null ? other.getDeptCode() == null : this.getDeptCode().equals(other.getDeptCode()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getLeaderId() == null ? other.getLeaderId() == null : this.getLeaderId().equals(other.getLeaderId()))
            && (this.getLeaderName() == null ? other.getLeaderName() == null : this.getLeaderName().equals(other.getLeaderName()))
            && (this.getDingUserId() == null ? other.getDingUserId() == null : this.getDingUserId().equals(other.getDingUserId()))
            && (this.getXrxsUserId() == null ? other.getXrxsUserId() == null : this.getXrxsUserId().equals(other.getXrxsUserId()))
            && (this.getXrxsLeaderId() == null ? other.getXrxsLeaderId() == null : this.getXrxsLeaderId().equals(other.getXrxsLeaderId()))
            && (this.getXrxsPositionId() == null ? other.getXrxsPositionId() == null : this.getXrxsPositionId().equals(other.getXrxsPositionId()))
            && (this.getLarkUserId() == null ? other.getLarkUserId() == null : this.getLarkUserId().equals(other.getLarkUserId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEntryDate() == null ? other.getEntryDate() == null : this.getEntryDate().equals(other.getEntryDate()))
            && (this.getDismissionDate() == null ? other.getDismissionDate() == null : this.getDismissionDate().equals(other.getDismissionDate()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getHireType() == null ? other.getHireType() == null : this.getHireType().equals(other.getHireType()))
            && (this.getCorpName() == null ? other.getCorpName() == null : this.getCorpName().equals(other.getCorpName()))
            && (this.getJobCode() == null ? other.getJobCode() == null : this.getJobCode().equals(other.getJobCode()))
            && (this.getDeptIdList() == null ? other.getDeptIdList() == null : this.getDeptIdList().equals(other.getDeptIdList()))
            && (this.getManagementForm() == null ? other.getManagementForm() == null : this.getManagementForm().equals(other.getManagementForm()))
            && (this.getWorkCity() == null ? other.getWorkCity() == null : this.getWorkCity().equals(other.getWorkCity()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getMonth() == null ? other.getMonth() == null : this.getMonth().equals(other.getMonth()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getIdCardNumber() == null) ? 0 : getIdCardNumber().hashCode());
        result = prime * result + ((getEmployeeNo() == null) ? 0 : getEmployeeNo().hashCode());
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getDeptCode() == null) ? 0 : getDeptCode().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getLeaderId() == null) ? 0 : getLeaderId().hashCode());
        result = prime * result + ((getLeaderName() == null) ? 0 : getLeaderName().hashCode());
        result = prime * result + ((getDingUserId() == null) ? 0 : getDingUserId().hashCode());
        result = prime * result + ((getXrxsUserId() == null) ? 0 : getXrxsUserId().hashCode());
        result = prime * result + ((getXrxsLeaderId() == null) ? 0 : getXrxsLeaderId().hashCode());
        result = prime * result + ((getXrxsPositionId() == null) ? 0 : getXrxsPositionId().hashCode());
        result = prime * result + ((getLarkUserId() == null) ? 0 : getLarkUserId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEntryDate() == null) ? 0 : getEntryDate().hashCode());
        result = prime * result + ((getDismissionDate() == null) ? 0 : getDismissionDate().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getHireType() == null) ? 0 : getHireType().hashCode());
        result = prime * result + ((getCorpName() == null) ? 0 : getCorpName().hashCode());
        result = prime * result + ((getJobCode() == null) ? 0 : getJobCode().hashCode());
        result = prime * result + ((getDeptIdList() == null) ? 0 : getDeptIdList().hashCode());
        result = prime * result + ((getManagementForm() == null) ? 0 : getManagementForm().hashCode());
        result = prime * result + ((getWorkCity() == null) ? 0 : getWorkCity().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", idCardNumber=").append(idCardNumber);
        sb.append(", employeeNo=").append(employeeNo);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", position=").append(position);
        sb.append(", deptId=").append(deptId);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", deptName=").append(deptName);
        sb.append(", leaderId=").append(leaderId);
        sb.append(", leaderName=").append(leaderName);
        sb.append(", dingUserId=").append(dingUserId);
        sb.append(", xrxsUserId=").append(xrxsUserId);
        sb.append(", xrxsLeaderId=").append(xrxsLeaderId);
        sb.append(", xrxsPositionId=").append(xrxsPositionId);
        sb.append(", larkUserId=").append(larkUserId);
        sb.append(", status=").append(status);
        sb.append(", entryDate=").append(entryDate);
        sb.append(", dismissionDate=").append(dismissionDate);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", hireType=").append(hireType);
        sb.append(", corpName=").append(corpName);
        sb.append(", jobCode=").append(jobCode);
        sb.append(", deptIdList=").append(deptIdList);
        sb.append(", managementForm=").append(managementForm);
        sb.append(", workCity=").append(workCity);
        sb.append(", userType=").append(userType);
        sb.append(", month=").append(month);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}