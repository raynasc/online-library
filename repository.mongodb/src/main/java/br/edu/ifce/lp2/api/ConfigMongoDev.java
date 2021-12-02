package br.edu.ifce.lp2.api;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class ConfigMongoDev {
    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(getMongoClient(), "lp2021-online-library");
    }

    private MongoClient getMongoClient() {
        return MongoClients.create("mongodb+srv://lp2:9sPpfptyRDumWWhY@lp2-cluster-01.zqexz.mongodb.net");
    }
}
