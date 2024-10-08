package com.entity.vo;

import com.entity.ZhiyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 职员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhiyuan")
public class ZhiyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 职员姓名
     */

    @TableField(value = "zhiyuan_name")
    private String zhiyuanName;


    /**
     * 头像
     */

    @TableField(value = "zhiyuan_photo")
    private String zhiyuanPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 联系方式
     */

    @TableField(value = "zhiyuan_phone")
    private String zhiyuanPhone;


    /**
     * 身份证号
     */

    @TableField(value = "zhiyuan_id_number")
    private String zhiyuanIdNumber;


    /**
     * 邮箱
     */

    @TableField(value = "zhiyuan_email")
    private String zhiyuanEmail;


    /**
     * 假删
     */

    @TableField(value = "zhiyuan_delete")
    private Integer zhiyuanDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：职员姓名
	 */
    public String getZhiyuanName() {
        return zhiyuanName;
    }


    /**
	 * 获取：职员姓名
	 */

    public void setZhiyuanName(String zhiyuanName) {
        this.zhiyuanName = zhiyuanName;
    }
    /**
	 * 设置：头像
	 */
    public String getZhiyuanPhoto() {
        return zhiyuanPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setZhiyuanPhoto(String zhiyuanPhoto) {
        this.zhiyuanPhoto = zhiyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getZhiyuanPhone() {
        return zhiyuanPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setZhiyuanPhone(String zhiyuanPhone) {
        this.zhiyuanPhone = zhiyuanPhone;
    }
    /**
	 * 设置：身份证号
	 */
    public String getZhiyuanIdNumber() {
        return zhiyuanIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setZhiyuanIdNumber(String zhiyuanIdNumber) {
        this.zhiyuanIdNumber = zhiyuanIdNumber;
    }
    /**
	 * 设置：邮箱
	 */
    public String getZhiyuanEmail() {
        return zhiyuanEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setZhiyuanEmail(String zhiyuanEmail) {
        this.zhiyuanEmail = zhiyuanEmail;
    }
    /**
	 * 设置：假删
	 */
    public Integer getZhiyuanDelete() {
        return zhiyuanDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setZhiyuanDelete(Integer zhiyuanDelete) {
        this.zhiyuanDelete = zhiyuanDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
