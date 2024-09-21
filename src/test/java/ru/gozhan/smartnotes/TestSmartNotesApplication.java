package ru.gozhan.smartnotes;

import org.springframework.boot.SpringApplication;

public class TestSmartNotesApplication {

    public static void main(String[] args) {
        SpringApplication.from(SmartNotesApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
