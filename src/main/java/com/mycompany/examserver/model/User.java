/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Loki
 */
@XmlRootElement
public class User {

    private int id;
    private String username;
    private String password;
    private String name;
    public enum Role {ADMIN, STUDENT, TEACHER}; 
    private Role role;

    public User(int id, String username, String password, String name, Role role) {
	this.id = id;
	this.username = username;
        this.password = password;
        this.name = name;
        this.role = role;
	}

    public Role getRole() {
	return role;
	}
    
    public void setRole(Role role) {
        this.role = role;
    }

        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}


