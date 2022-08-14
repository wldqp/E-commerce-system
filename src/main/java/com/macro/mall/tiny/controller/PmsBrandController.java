package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: // 品牌管理Controller
 * @ClassName: PmsBrandController    // 类名，会自动填充
 * @Author: weisn          // 创建者
 * @Date: 2022/6/19 19:53   // 时间
 * @Version: 1.0     // 版本
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
  @Autowired
  private PmsBrandService brandService;

  private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

  @ApiOperation("获取所有品牌数据")
  @RequestMapping(value = "/listAll", method = RequestMethod.GET)
  @ResponseBody
  public CommonResult<List<PmsBrand>> getBrandList() {
    return CommonResult.success(brandService.listAllBrand());
  }

  @ApiOperation("添加品牌")
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  @ResponseBody
  public CommonResult createBrand(@RequestBody PmsBrand pmsBrand) {
    CommonResult commonResult;
    int count = brandService.createBrand(pmsBrand);
    if(count == 1){
      commonResult = CommonResult.success(pmsBrand);
      LOGGER.debug("createVrand success:{}", pmsBrand);
    } else {
      commonResult = CommonResult.failed("操作失败");
      LOGGER.debug("createBrand failed:{}", pmsBrand);
    }
    return commonResult;
  }

  @ApiOperation("更新指定id品牌信息")
  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  @ResponseBody
  public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrand pmsBrandDto, BindingResult result){
    CommonResult commonResult;
    int count = brandService.updateBrand(id, pmsBrandDto);
    if (count == 1) {
      commonResult = CommonResult.success(pmsBrandDto);
      LOGGER.debug("updateBrand success:{}", pmsBrandDto);
    } else {
      commonResult = CommonResult.failed("操作失败");
      LOGGER.debug("updateBrand failed:{}", pmsBrandDto);
    }
    return commonResult;
  }

  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
  public CommonResult deleteBrand(@PathVariable("id") Long id){
    int count = brandService.deleteBrand(id);
    if(count == 1){
      LOGGER.debug("deleteBrand success :id={}", id);
      return CommonResult.success(null);
    } else {
      LOGGER.debug("deleteBrand failed : id={}", id);
      return CommonResult.failed("操作失败");
    }
  }

  @ApiOperation("分页查询品牌列表")
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  @ResponseBody
  public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
    List<PmsBrand> brandList = brandService.listBrand(pageNum, pageSize);
    return CommonResult.success(CommonPage.restPage(brandList));
  }

  @ApiOperation("获取指定id品牌详情")
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
    return CommonResult.success(brandService.getBrand(id));
  }
}
