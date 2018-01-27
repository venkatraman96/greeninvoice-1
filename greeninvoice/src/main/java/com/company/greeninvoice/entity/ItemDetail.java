package com.company.greeninvoice.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * ItemDetail is bean class.
 * @author Venkatraman
 *
 */
@Data
@Entity
@Table(name="itemdetailpojodto")
public class ItemDetail  implements Serializable{

	@Id
	private Timestamp createdTime;
	
	 private String serialNumber;
	
	 private String itemDescription;
	
	 private int itemQuantity;
	 
	 private float itemRate;
	
	 private float amount;

}
