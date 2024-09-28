package ru.gozhan.smartnotes;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
@Slf4j
class SmartNotesApplicationTests {

    @Test
    void contextLoads() {
        log.info("It works!");
    }

}
