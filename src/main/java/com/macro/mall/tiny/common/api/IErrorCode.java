package com.macro.mall.tiny.common.api;

/**
 * @Description: // 封装API的错误码
 * @ClassName: IErrorCode    // 类名，会自动填充
 * @Author: weisn          // 创建者
 * @Date: 2022/6/20 11:11   // 时间
 * @Version: 1.0     // 版本
 */
public interface IErrorCode {
  long getCode();

  String getMessage();
}
