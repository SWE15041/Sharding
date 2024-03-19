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
//        String file = Thread.currentThread().getClass().getClassLoader().getResource("sharding.yaml").getFile();
//        if (file == null) {
//            return null;
//        }
//        File yamlFile = new File(file);
//        return YamlShardingSphereDataSourceFactory.createDataSource(yamlFile);
//    }
}
