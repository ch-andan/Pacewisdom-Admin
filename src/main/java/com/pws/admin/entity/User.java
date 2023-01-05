package com.pws.admin.entity;

import java.io.Serializable;
import java.sql.Date;

import com.pws.admin.utility.AuditModel;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;
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
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })
public class User extends AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name", length = 50,nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 50,nullable = false)
	private String lastName;

	@Column(name="dob",nullable = false)
	//@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;

	@Column(name = "email", length = 100,nullable = false, unique = true)
	private String email;

	@Column(name = "phone_number",length = 12,nullable = false)
	private String phoneNumber;

	@Column(name = "password",nullable = false)
	private String password;

}
