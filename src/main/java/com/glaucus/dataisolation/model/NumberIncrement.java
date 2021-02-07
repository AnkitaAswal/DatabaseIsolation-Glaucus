package com.glaucus.dataisolation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ankita.aswal
 *
 */
@Entity
@Table(name="numberincrement")
@Data
@NoArgsConstructor
public class NumberIncrement implements Serializable {

	/**
	 * The serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name="count")
	private int count;

	@Version
	private Long version;
}
