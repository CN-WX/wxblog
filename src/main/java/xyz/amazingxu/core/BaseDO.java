package xyz.amazingxu.core;

import javax.persistence.*;
import java.util.Date;

/**
 * 领域基类
 * @author xuwang <121894598@qq.com>
 * @date 2018/5/18 22:38
 */

@MappedSuperclass
public abstract class BaseDO {

    /**
     * 主键id
     */
    @Id
    @Column(nullable = false,length = 40)
   private String id;

    /**
     * 是否删除
     */
    @Column(name = "is_deleted",nullable = false)
    private boolean deleted;
    /**
     * 创建人
     */
    @Column(name = "create_user", nullable = false, length = 40)
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    /**
     * 备注
     */
    @Column(name = "remark", length = 100)
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
