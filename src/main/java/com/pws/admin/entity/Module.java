package com.pws.admin.entity;

import java.io.Serializable;
import java.sql.Date;

import org.hibernate.annotations.ColumnDefault;

import com.pws.admin.utility.AuditModel;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "module")
public class Module extends AuditModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name="is_active")
	@ColumnDefault("TRUE")
	private Boolean isActive;
	
	@Column(name="name", nullable = false, unique = true)
	private String name;

}
