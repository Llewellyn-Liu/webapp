package com.lrl.liustationspring;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lrl.liustationspring.controller.tools.BCryptor;
import com.lrl.liustationspring.dao.SqlConnection;
import com.lrl.liustationspring.dao.mapper.UserMapper;
import com.lrl.liustationspring.dao.pojo.User;
import com.lrl.liustationspring.dao.pojo.userREST.*;
import com.lrl.liustationspring.service.DataManipulationService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.List;


public class MybatisImpTest {

    Logger logger = LoggerFactory.getLogger(MybatisImpTest.class);
    @Test
    public void testMybatis() throws IOException {
        String password = "990213";
        String anotherPswd = "990213";

        User user = DataManipulationService.getInstance().getUserById(13);
        System.out.println(user.toString());
        System.out.println(BCrypt.checkpw("000000","$2a$10$yzZcnJMECTuuGz8oMzTxLewWWt2SHZ3/TdGmZb50BGLkHNq5Z9pOq"));

    }
}
