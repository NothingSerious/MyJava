package org.example.myjavademo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;


public class CodeGenerator {

//    public static void main(String[] args) {
//        // 使用 Builder 模式构建 AutoGenerator 对象
//        AutoGenerator autoGenerator = new AutoGenerator(new DataSourceConfig.Builder(
//                "jdbc:mysql://rm-2ze1q6181kp57235c.mysql.rds.aliyuncs.com:3306/gong_ming?serverTimezone=GMT%2b8:00&useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&allowMultiQueries=true&useSSL=false",
//                "new_task_package",
//                "MCFQ4q0FQ5"
//        ).build());
//
//        // 全局配置
//        autoGenerator.global(new GlobalConfig.Builder()
//                .outputDir(System.getProperty("user.dir") + "/src/main/java") // 输出目录
////                .enableSwagger() // 开启 Swagger2
//                .author("Genki") // 作者
//                .openDir(false) // 是否打开输出目录
////                .fileOverride() // 是否覆盖已有文件
//                .build()
//        );
//
//        // 包配置
//        autoGenerator.packageInfo(new PackageConfig.Builder()
//                .parent("org.example.myjavademo") // 父包名
//                .moduleName("employee")
//                .entity("entity") // 实体包名
//                .service("service") // 服务包名
//                .serviceImpl("service.impl") // 服务实现包名
//                .mapper("mapper") // Mapper 层包名
//                .xml("resources.mapper") // Mapper XML 配置文件包名
//                .build() // 模块名
//        );
//
//        // 策略配置
//        autoGenerator.strategy(new StrategyConfig.Builder()
//                .addInclude("employee") // 需要生成的表名
//                .addTablePrefix("") // 表前缀
//                .entityBuilder()
//                .naming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
//                .enableLombok()
//                .build()
//        );
//
//        // 执行生成操作
//        autoGenerator.execute();
//    }
}
