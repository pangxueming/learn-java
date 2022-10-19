package com.example.demo;

import cn.hutool.core.io.resource.ClassPathResource;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

/**
 * @author
 * @since 2018/12/13
 */
public class CodeGenerator {

  @Test
  public void run() {

    // 1、创建代码生成器
    AutoGenerator mpg = new AutoGenerator();

    // 2、全局配置
    GlobalConfig gc = new GlobalConfig();
    String projectPath = System.getProperty("user.dir");
    gc.setOutputDir(projectPath + "/src/main/java");

    gc.setAuthor("");
    gc.setOpen(false); //生成后是否打开资源管理器
    gc.setFileOverride(false); //重新生成时文件是否覆盖
    gc.setServiceName("%sService");    //去掉Service接口的首字母I
    gc.setIdType(IdType.AUTO); //主键策略
    gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
    gc.setSwagger2(true);//开启Swagger2模式

    mpg.setGlobalConfig(gc);

    // 3、数据源配置
    DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://192.168.1.220:3306/match2_xn?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8");
    dsc.setUrl("jdbc:mysql://127.0.0.1:3306/test?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8");

    dsc.setDriverName("com.mysql.cj.jdbc.Driver");
    dsc.setUsername("root");
    dsc.setPassword("123456");
//        dsc.setPassword("Bmq091123");
    dsc.setDbType(DbType.MYSQL);
    mpg.setDataSource(dsc);

    // 4、包配置
    PackageConfig pc = new PackageConfig();
    pc.setModuleName("test"); //模块名
    pc.setParent("com.biomatch.test");

    pc.setController("controller");
    pc.setEntity("entity");
    pc.setService("service");
    pc.setMapper("mapper");
    mpg.setPackageInfo(pc);

    // 5、策略配置
    StrategyConfig strategy = new StrategyConfig();
//        strategy.setInclude("pl_hx_semen");

    strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
    strategy.setTablePrefix(pc.getModuleName() + "_"); //生成实体时去掉表前缀
    strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
    strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作
    strategy.setRestControllerStyle(true); //restful api风格控制器
    strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

    mpg.setStrategy(strategy);

    // 6、执行
    mpg.execute();
  }

  @Test
  public void Test() {
        /*StringBuffer sbf = new StringBuffer();
        for (int i = 0; i<5 ;i++){
            String a = "1";
            sbf.append(a);
            System.out.println(sbf);
        }*/
    String path = "META-INF/MANIFEST.MF";
//        String path = "D:\\测试流程.md";
//        ClassPathResource resource = new ClassPathResource(path);

     /*   // 使用ArrayList来存储每行读取到的字符串
        ArrayList arrayList = new ArrayList<>();

        try {
            ClassPathResource resource = new ClassPathResource(path);
            System.out.println(resource);
            FileReader f = new FileReader(path);
            BufferedReader b = new BufferedReader(f);
            String s;
        //判断是否到一行字符串
            while ((s = b.readLine()) != null) {
                arrayList.add(s);
            }
            System.out.println(arrayList);
            b.close();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("异常");
            }*/

  }
}
