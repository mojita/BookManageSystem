package com.cn.design.domain.domaintest;

import java.util.Set;

/**
 * Created by lijunhong on 17/2/14.
 */
public class School {
    private Integer id;
    private String name;
    private Set<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
