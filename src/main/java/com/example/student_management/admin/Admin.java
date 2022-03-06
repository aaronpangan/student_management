package com.example.student_management.admin;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    @Column()
    String name;

    @Column()
    String lname;

    @Column()
    int num;

    public Admin() {
    }

    public Admin(long id, String name, String lname, int num) {
        this.id = id;
        this.name = name;
        this.lname = lname;
        this.num = num;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Admin id(long id) {
        setId(id);
        return this;
    }

    public Admin name(String name) {
        setName(name);
        return this;
    }

    public Admin lname(String lname) {
        setLname(lname);
        return this;
    }

    public Admin num(int num) {
        setNum(num);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Admin)) {
            return false;
        }
        Admin admin = (Admin) o;
        return id == admin.id && Objects.equals(name, admin.name) && Objects.equals(lname, admin.lname)
                && num == admin.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lname, num);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", lname='" + getLname() + "'" +
                ", num='" + getNum() + "'" +
                "}";
    }

}
