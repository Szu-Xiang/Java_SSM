package com.szu.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    //TODO:配置SqlSessionFactoryBean对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);

        //扫描实体类所在的包
        factoryBean.setTypeAliasesPackage("com.szu.domain");
        return factoryBean;
    }

    //TODO:配置MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {

        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        //扫描Mapper接口所在的包
        msc.setBasePackage("com.szu.mapper");

        return msc;
    }
}
