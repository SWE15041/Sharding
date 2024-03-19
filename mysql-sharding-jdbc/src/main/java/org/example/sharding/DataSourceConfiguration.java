package org.example.sharding;

import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Yanni
 */
//@Configuration
public class DataSourceConfiguration {
//    @Bean
//    public DataSource dataSource() throws SQLException, IOException {
//        File yamlFile = new File("sharding.yaml");
//        return YamlShardingSphereDataSourceFactory.createDataSource(yamlFile);
//    }
}
