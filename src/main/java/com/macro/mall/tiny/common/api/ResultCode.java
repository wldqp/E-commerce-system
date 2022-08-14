package com.macro.mall.tiny.common.api;

/**
 * @Description: // 枚举了一些常用API操作码
 * @ClassName: ResultCode    // 类名，会自动填充
 * @Author: weisn          // 创建者
 * @Date: 2022/6/20 11:11   // 时间
 * @Version: 1.0     // 版本
 */
public enum ResultCode implements IErrorCode {
  SUCCESS(200, "操作成功"),
  FAILED(500, "操作失败"),
  VALIDATE_FAILED(400, "参数检验失败"),
  UNAUTHORIZED(401, "暂未登录或token已经过期"),
  FORBIDDEN(403, "没有相关权限");
  private long code;
  private String message;

  private ResultCode(long code, String message){
    this.code = code;
    this.message = message;
  }

  public long getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
