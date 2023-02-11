package com.lrl.liustationspring;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lrl.liustationspring.controller.tools.BCryptor;
import com.lrl.liustationspring.dao.SqlConnection;
import com.lrl.liustationspring.dao.mapper.ProductMapper;
import com.lrl.liustationspring.dao.mapper.UserMapper;
import com.lrl.liustationspring.dao.pojo.Product;
import com.lrl.liustationspring.dao.pojo.User;
import com.lrl.liustationspring.dao.pojo.userREST.*;
import com.lrl.liustationspring.jsonTest.Prime;
import com.lrl.liustationspring.service.DataManipulationService;
import com.lrl.liustationspring.service.ProductDataService;
import io.swagger.models.auth.In;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCrypt;
import springfox.documentation.spring.web.json.Json;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class MybatisImpTest {

    Logger logger = LoggerFactory.getLogger(MybatisImpTest.class);
    @Test
    public void testMybatis() throws IOException {
//        String password = "990213";
////        String anotherPswd = "990213";
////
////        User user = DataManipulationService.getInstance().getUserById(13);
////        System.out.println(user.toString());
////        System.out.println(BCrypt.checkpw("000000","$2a$10$yzZcnJMECTuuGz8oMzTxLewWWt2SHZ3/TdGmZb50BGLkHNq5Z9pOq"));
        SqlSession session = SqlConnection.getSession();
        ProductMapper mapper = session.getMapper(ProductMapper.class);

        Date d = new Date();
        System.out.println(d);
        Product product = new Product(null, "t_5","t_desc5", "t_abcd353", "t_m5", d, d, 1555, 9801);
        mapper.insertNewProduct(product);

        System.out.println("---" + d);
        Product rev = mapper.getProductByTimeCreated(d);
        System.out.println(rev.toString());
//        System.out.println(mapper.insertNewProduct(product));

    }
}
