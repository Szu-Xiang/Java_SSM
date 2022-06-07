package com.szu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JdbcConfig {

    //TODO:读取配置文件中数据库连接四要素
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    //TODO:配置连接池dataSource
    @Bean
    public DataSource dataSource() {

        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);

        return ds;
    }

    //TODO:配置平台事务管理器对象
    @Bean
    public PlatformTransactionManager platformTransactionManager(DataSource dataSource) {

        DataSourceTransactionManager ds = new DataSourceTransactionManager();
        ds.setDataSource(dataSource);

        return ds;
    }

}
