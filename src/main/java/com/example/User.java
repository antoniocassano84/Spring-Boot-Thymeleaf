package com.example;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
  private String name;
  private String email;
  private String password;
  private String gender;
  private String note;
  private String profession;
  private boolean married;
  private Date birthday;
}
