package com.example.springboothandleexception;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;

@SpringBootTest
public class SimpleTest {

    private final Logger log = LoggerFactory.getLogger(SimpleTest.class);

    @Autowired
    MessageSource messageSource;

    @Test
    void test() {
        Locale.setDefault(Locale.KOREA);
        log.info("locale default message : {}", messageSource.getMessage("greeting", new String[]{"1"}, Locale.getDefault()));
        log.info("locale ko message : {}", messageSource.getMessage("greeting", new String[]{"2"}, Locale.KOREA));
        log.info("locale en message : {}", messageSource.getMessage("greeting", new String[]{"3"}, Locale.US));
    }
}
