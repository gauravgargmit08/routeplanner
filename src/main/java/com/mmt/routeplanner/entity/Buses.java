package com.mmt.routeplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Buses")
@Data
public class Buses extends BaseMedium {

  private String bus_Id;

}
