package com.prukacz.damian.configuration;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;



@Configuration

public class PersistenceConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/service-hotel");
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin");

        return dataSource;
    }


    @Bean
    public HibernateProperties properties(@Autowired Environment env) {
        return new HibernateProperties(env);
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Autowired HibernateProperties properties) {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.prukacz.damian.repository");
        factory.setDataSource(dataSource());
        factory.setJpaProperties(properties.toProperties());

        return factory;

    }
}
