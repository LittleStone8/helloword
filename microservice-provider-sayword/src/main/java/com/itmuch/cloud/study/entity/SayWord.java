package com.itmuch.cloud.study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SayWord {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column
  private String say;
  @Column
  private String version;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSay() {
	return say;
  }

  public void setSay(String say) {
	this.say = say;
  }

  public String getVersion() {
	return version;
  }

  public void setVersion(String version) {
	this.version = version;
  }

}
