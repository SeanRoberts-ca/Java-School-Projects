package com.mvc.bean;

public class ProfileBean {
 
 private String fullName;
 private String email;
 private String userName;
 private String password;
 private String conpassword;
 private String oldpassword;
 
 public String getUserName() {
 return userName;
 }
 public void setUserName(String userName) {
 this.userName = userName;
 }
 public String getOldPassword() {
 return oldpassword;
 }
 public void setOldPassword(String oldpassword) {
 this.oldpassword = oldpassword;
 }
 public String getPassword() {
 return password;
 }
 public void setPassword(String password) {
 this.password = password;
 }
 public String getConPassword() {
 return conpassword;
 }
 public void setConPassword(String conpassword) {
 this.conpassword = conpassword;
 }
 public void setFullName(String fullName) {
 this.fullName = fullName;
 }
 public String getFullName() {
 return fullName;
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public String getEmail() {
 return email;
 }
}