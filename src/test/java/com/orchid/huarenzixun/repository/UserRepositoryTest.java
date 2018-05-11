package com.orchid.huarenzixun.repository;

import com.orchid.huarenzixun.configuration.RepositoryConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RepositoryConfig.class)
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;


    @Test
    public void userRepositoryNotBeNull() {
        Assert.assertNotNull(userRepository);
    }

}
