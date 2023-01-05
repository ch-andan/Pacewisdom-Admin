package com.pws.admin.entity;

import java.io.Serializable;

import com.pws.admin.utility.AuditModel;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Role extends AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Nonnull
	@Column(length=50,unique=true)
	private String name;
	
	@Nonnull
	private  Boolean IsActive;
	
}
