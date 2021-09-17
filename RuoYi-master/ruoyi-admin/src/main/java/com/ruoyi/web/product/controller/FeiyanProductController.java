package com.ruoyi.web.product.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.product.domain.FeiyanProduct;
import com.ruoyi.product.service.IFeiyanProductService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;

import java.util.List;

/**
 * 产品展示Controller
 * 
 * @author liyunfei
 * @date 2021-09-15
 */
@Controller
@RequestMapping("/product/product")
public class FeiyanProductController extends BaseController
{
    private String prefix = "product";

    @Autowired
    private IFeiyanProductService feiyanProductService;

    @RequiresPermissions("product:product:view")
    @GetMapping()
    public String product()
    {
        System.out.println("=====================");
        return prefix + "/product";
    }

    /**
     * 查询产品展示列表
     */
    @RequiresPermissions("product:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FeiyanProduct feiyanProduct)
    {
        startPage();
        List<FeiyanProduct> list = feiyanProductService.selectFeiyanProductList(feiyanProduct);
        return getDataTable(list);
    }

    /**
     * 导出产品展示列表
     */
    @RequiresPermissions("product:product:export")
    @Log(title = "产品展示", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FeiyanProduct feiyanProduct)
    {
        List<FeiyanProduct> list = feiyanProductService.selectFeiyanProductList(feiyanProduct);
        ExcelUtil<FeiyanProduct> util = new ExcelUtil<FeiyanProduct>(FeiyanProduct.class);
        return util.exportExcel(list, "产品展示数据");
    }

    /**
     * 新增产品展示
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产品展示
     */
    @RequiresPermissions("product:product:add")
    @Log(title = "产品展示", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FeiyanProduct feiyanProduct)
    {
        return toAjax(feiyanProductService.insertFeiyanProduct(feiyanProduct));
    }

    /**
     * 修改产品展示
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FeiyanProduct feiyanProduct = feiyanProductService.selectFeiyanProductById(id);
        mmap.put("feiyanProduct", feiyanProduct);
        return prefix + "/edit";
    }

    /**
     * 修改保存产品展示
     */
    @RequiresPermissions("product:product:edit")
    @Log(title = "产品展示", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FeiyanProduct feiyanProduct)
    {
        return toAjax(feiyanProductService.updateFeiyanProduct(feiyanProduct));
    }

    /**
     * 删除产品展示
     */
    @RequiresPermissions("product:product:remove")
    @Log(title = "产品展示", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(feiyanProductService.deleteFeiyanProductByIds(ids));
    }
}
