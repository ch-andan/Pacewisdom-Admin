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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "permissions")
public class Permission extends AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="is_active",nullable = false)
	@ColumnDefault("TRUE")
	private Boolean isActive;
	
	@Column(name="is_view",nullable = false)
	@ColumnDefault("TRUE")
	private Boolean isView;
	
	@Column(name="is_add",nullable = false)
	@ColumnDefault("TRUE")
	private Boolean isAdd;
	
	@Column(name="is_update",nullable = false)
	@ColumnDefault("TRUE")
	private Boolean isUpdate;
	
	@Column(name="is_delete",nullable = false)
	@ColumnDefault("TRUE")
	private Boolean isDelete;
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private Module model;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	

}
