package com.uniview.report.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName report_configuration
 */
@TableName(value ="report_configuration")
public class ReportConfiguration implements Serializable {
    /**
     * 报表ID
     */
    @TableId(type = IdType.AUTO)
    private Long reportId;

    /**
     * 报表名称
     */
    private String reportName;

    /**
     * 报表描述
     */
    private String reportDescription;

    /**
     * 报表查询语句
     */
    private String reportQuery;

    /**
     * 创建时间
     */
    private Date createdAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 报表ID
     */
    public Long getReportId() {
        return reportId;
    }

    /**
     * 报表ID
     */
    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    /**
     * 报表名称
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * 报表名称
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * 报表描述
     */
    public String getReportDescription() {
        return reportDescription;
    }

    /**
     * 报表描述
     */
    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    /**
     * 报表查询语句
     */
    public String getReportQuery() {
        return reportQuery;
    }

    /**
     * 报表查询语句
     */
    public void setReportQuery(String reportQuery) {
        this.reportQuery = reportQuery;
    }

    /**
     * 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

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
        ReportConfiguration other = (ReportConfiguration) that;
        return (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getReportName() == null ? other.getReportName() == null : this.getReportName().equals(other.getReportName()))
            && (this.getReportDescription() == null ? other.getReportDescription() == null : this.getReportDescription().equals(other.getReportDescription()))
            && (this.getReportQuery() == null ? other.getReportQuery() == null : this.getReportQuery().equals(other.getReportQuery()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getReportName() == null) ? 0 : getReportName().hashCode());
        result = prime * result + ((getReportDescription() == null) ? 0 : getReportDescription().hashCode());
        result = prime * result + ((getReportQuery() == null) ? 0 : getReportQuery().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reportId=").append(reportId);
        sb.append(", reportName=").append(reportName);
        sb.append(", reportDescription=").append(reportDescription);
        sb.append(", reportQuery=").append(reportQuery);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}