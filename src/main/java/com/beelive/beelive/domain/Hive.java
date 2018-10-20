package com.beelive.beelive.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Hive {
	
	private @Id @GeneratedValue Long id;
	
	private Date dateCreation;

}
