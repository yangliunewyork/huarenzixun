package com.orchid.huarenzixun.model;

import com.orchid.huarenzixun.configuration.ModelConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ModelConfig.class)
public class BookTest {

    @Autowired
    private Book m_book;

    @Test
    public void userNotBeNull() {
        Assert.assertNotNull(m_book);
    }

}
