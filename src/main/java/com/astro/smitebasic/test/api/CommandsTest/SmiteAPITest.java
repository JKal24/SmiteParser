package com.astro.smitebasic.test.api.CommandsTest;

import com.astro.smitebasic.api.SmiteAPI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmiteAPITest {

    @Autowired
    private SmiteAPI api;

    @Test
    public void getPlayerData() {
        String sampleAccount = "Ovenfresh";


    }

}
