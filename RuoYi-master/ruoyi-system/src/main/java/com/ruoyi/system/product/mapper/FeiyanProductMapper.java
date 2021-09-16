package com.ruoyi.system.product.mapper;

import java.util.List;
import com.ruoyi.system.product.domain.FeiyanProduct;

/**
 * 产品展示Mapper接口
 * 
 * @author liyunfei
 * @date 2021-09-15
 */
public interface FeiyanProductMapper 
{
    /**
     * 查询产品展示
     * 
     * @param id 产品展示主键
     * @return 产品展示
     */
    public FeiyanProduct selectFeiyanProductById(Long id);

    /**
     * 查询产品展示列表
     * 
     * @param feiyanProduct 产品展示
     * @return 产品展示集合
     */
    public List<FeiyanProduct> selectFeiyanProductList(FeiyanProduct feiyanProduct);

    /**
     * 新增产品展示
     * 
     * @param feiyanProduct 产品展示
     * @return 结果
     */
    public int insertFeiyanProduct(FeiyanProduct feiyanProduct);

    /**
     * 修改产品展示
     * 
     * @param feiyanProduct 产品展示
     * @return 结果
     */
    public int updateFeiyanProduct(FeiyanProduct feiyanProduct);

    /**
     * 删除产品展示
     * 
     * @param id 产品展示主键
     * @return 结果
     */
    public int deleteFeiyanProductById(Long id);

    /**
     * 批量删除产品展示
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFeiyanProductByIds(String[] ids);
}
