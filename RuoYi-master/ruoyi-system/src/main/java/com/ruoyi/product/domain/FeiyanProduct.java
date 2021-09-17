package com.ruoyi.product.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 产品展示对象 feiyan_product
 * 
 * @author liyunfei
 * @date 2021-09-15
 */
public class FeiyanProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 编号 */
    @Excel(name = "编号")
    private String code;

    /** 文件id */
    @Excel(name = "文件id")
    private String filedId;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String filedName;

    /** 文件id */
    @Excel(name = "文件id")
    private String filedId1;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String filedName1;

    /** 文件id */
    @Excel(name = "文件id")
    private String filedId2;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String filedName2;

    /** 文件id */
    @Excel(name = "文件id")
    private String filedId3;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String filedName3;

    /** 文件id */
    @Excel(name = "文件id")
    private String filedId4;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String filedName4;

    /** 创建角色 */
    @Excel(name = "创建角色")
    private String role;

    /** 产品材料类型 */
    @Excel(name = "产品材料类型")
    private String productType;

    /** 是否删除（ 0:否1:是） */
    @Excel(name = "是否删除", readConverterExp = "0=:否1:是")
    private String idDel;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setFiledId(String filedId) 
    {
        this.filedId = filedId;
    }

    public String getFiledId() 
    {
        return filedId;
    }
    public void setFiledName(String filedName) 
    {
        this.filedName = filedName;
    }

    public String getFiledName() 
    {
        return filedName;
    }
    public void setFiledId1(String filedId1) 
    {
        this.filedId1 = filedId1;
    }

    public String getFiledId1() 
    {
        return filedId1;
    }
    public void setFiledName1(String filedName1) 
    {
        this.filedName1 = filedName1;
    }

    public String getFiledName1() 
    {
        return filedName1;
    }
    public void setFiledId2(String filedId2) 
    {
        this.filedId2 = filedId2;
    }

    public String getFiledId2() 
    {
        return filedId2;
    }
    public void setFiledName2(String filedName2) 
    {
        this.filedName2 = filedName2;
    }

    public String getFiledName2() 
    {
        return filedName2;
    }
    public void setFiledId3(String filedId3) 
    {
        this.filedId3 = filedId3;
    }

    public String getFiledId3() 
    {
        return filedId3;
    }
    public void setFiledName3(String filedName3) 
    {
        this.filedName3 = filedName3;
    }

    public String getFiledName3() 
    {
        return filedName3;
    }
    public void setFiledId4(String filedId4) 
    {
        this.filedId4 = filedId4;
    }

    public String getFiledId4() 
    {
        return filedId4;
    }
    public void setFiledName4(String filedName4) 
    {
        this.filedName4 = filedName4;
    }

    public String getFiledName4() 
    {
        return filedName4;
    }
    public void setRole(String role) 
    {
        this.role = role;
    }

    public String getRole() 
    {
        return role;
    }
    public void setProductType(String productType) 
    {
        this.productType = productType;
    }

    public String getProductType() 
    {
        return productType;
    }
    public void setIdDel(String idDel) 
    {
        this.idDel = idDel;
    }

    public String getIdDel() 
    {
        return idDel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("code", getCode())
            .append("filedId", getFiledId())
            .append("filedName", getFiledName())
            .append("filedId1", getFiledId1())
            .append("filedName1", getFiledName1())
            .append("filedId2", getFiledId2())
            .append("filedName2", getFiledName2())
            .append("filedId3", getFiledId3())
            .append("filedName3", getFiledName3())
            .append("filedId4", getFiledId4())
            .append("filedName4", getFiledName4())
            .append("role", getRole())
            .append("productType", getProductType())
            .append("idDel", getIdDel())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
