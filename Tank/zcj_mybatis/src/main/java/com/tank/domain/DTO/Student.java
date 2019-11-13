package com.tank.domain.DTO;

import javax.print.DocFlavor;

/**
 * @author: ZCJ
 * @Date: 2019-11-10 09:34
 * @Description:
 */
public class Student {

private String name;
private int age;
private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
