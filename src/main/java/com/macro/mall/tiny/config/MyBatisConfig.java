package com.macro.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: MyBatis配置类  // 类说明，在创建类时要填写
 * @ClassName: MyBatisConfig    // 类名，会自动填充
 * @Author: weisn          // 创建者
 * @Date: 2022/6/20 20:24   // 时间
 * @Version: 1.0     // 版本
 */
@Configuration
@MapperScan("com.macro.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
