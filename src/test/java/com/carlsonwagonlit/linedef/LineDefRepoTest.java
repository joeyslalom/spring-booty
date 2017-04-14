package com.carlsonwagonlit.linedef;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by U035JXT on 4/14/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LineDefRepoTest {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private LineDefRepo repo;

    @Test
    public void parseJson() {
        LOG.info("test run");
        Assert.assertFalse("Repo has content", repo.lineDefs().isEmpty());
    }
}
