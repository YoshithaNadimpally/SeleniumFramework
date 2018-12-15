package com.company.project;

import org.openqa.selenium.Platform;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Test {

  public static void main(String[] args) {
    System.out.println(Platform.getCurrent());
    System.out.println(System.getProperty("user.dir"));
    System.out.println("User"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));

    System.out.println(String.format("//*[contains(text(),'%s')]/../preceding-sibling::*/input[@type='checkbox']","hannah.flores"));
  }

  public int priority() {
    return 0;
  }
}
