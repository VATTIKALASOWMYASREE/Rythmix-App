package com.Rythmix.Project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_table")
public class Admin {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 
 @Column(nullable=false,unique=true)
 private String username;
 @Column(nullable=false)
 private String password;
 @Column(nullable=false,unique=true)
 private String email;

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
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }

@Override
public String toString() {
 return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
}

}
