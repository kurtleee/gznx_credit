package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 网点表
 * @TableName main_net_point
 */
@TableName(value ="main_net_point")
@Data
public class MainNetPoint implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 网点名称
     */
    private String mainNetPointName;

    /**
     * 网点地址
     */
    private String mainNetPointAddress;

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
        MainNetPoint other = (MainNetPoint) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMainNetPointName() == null ? other.getMainNetPointName() == null : this.getMainNetPointName().equals(other.getMainNetPointName()))
            && (this.getMainNetPointAddress() == null ? other.getMainNetPointAddress() == null : this.getMainNetPointAddress().equals(other.getMainNetPointAddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMainNetPointName() == null) ? 0 : getMainNetPointName().hashCode());
        result = prime * result + ((getMainNetPointAddress() == null) ? 0 : getMainNetPointAddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mainNetPointName=").append(mainNetPointName);
        sb.append(", mainNetPointAddress=").append(mainNetPointAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}