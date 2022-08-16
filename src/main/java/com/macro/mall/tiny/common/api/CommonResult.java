//package com.macro.mall.tiny.common.api;
//
//import com.macro.mall.tiny.mbg.model.PmsBrand;
//
///**
// * @Description: // 通用返回对象
// * @ClassName: CommonResult    // 类名，会自动填充
// * @Author: weisn          // 创建者
// * @Date: 2022/6/20 10:43   // 时间
// * @Version: 1.0     // 版本
// */
//public class CommonResult<T> {
//  private long code;
//  private String message;
//  private T data;
//
//  protected CommonResult(){
//
//  }
//
//  protected CommonResult(long code, String message, T data){
//    this.code = code;
//    this.message = message;
//    this.data = data;
//  }
//
//  /**
//   * 成功返回结果
//   *
//   * @param data 获取的数据
//   */
//  public static <T> CommonResult<T> success(T data) {
//    return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
//  }
//
//  /**
//   * 成功返回结果
//   *
//   * @param data 获取的数据
//   * @param  message 提示信息
//   */
//  public static <T> CommonResult<T> success(T data, String message) {
//    return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
//  }
//
//  /**
//   * 失败返回结果
//   * @param errorCode 错误码
//   */
//  public static <T> CommonResult<T> failed(IErrorCode errorCode) {
//    return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
//  }
//
//  /**
//   * 失败返回结果
//   * @param message 提示信息
//   */
//  public static <T> CommonResult<T> failed(String message){
//    return new CommonResult<T>(ResultCode.FAILED.getCode(), message, null);
//  }
//
//  /**
//   * 失败返回结果
//   */
//  public static <T> CommonResult<T> validateFailed() {
//    return failed(ResultCode.VALIDATE_FAILED);
//  }
//
//  /**
//   * 参数验证失败返回结果
//   * @param message 提示信息
//   */
//  public static <T> CommonResult<T> validateFailed(String message) {
//    return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
//  }
//
//  /**
//   * 未登录返回结果
//   */
//  public static <T> CommonResult<T> unauthorized(T data) {
//    return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
//  }
//
//  /**
//   * 未授权返回结果
//   */
//  public static <T> CommonResult<T> forbidden(T data) {
//    return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
//  }
//
//  public long getCode() {
//    return code;
//  }
//
//  public void setCode(long code) {
//    this.code = code;
//  }
//
//  public String getMessage() {
//    return message;
//  }
//
//  public void setMessage(String message) {
//    this.message = message;
//  }
//
//  public T getData() {
//    return data;
//  }
//
//  public void setData(T data) {
//    this.data = data;
//  }
//}
