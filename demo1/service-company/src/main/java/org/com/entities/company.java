package org.com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class company {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Setter(AccessLevel.PUBLIC)  private Long id;
	@Setter(AccessLevel.PUBLIC)  private String name;
	@Setter(AccessLevel.PUBLIC)  private double price;

}
