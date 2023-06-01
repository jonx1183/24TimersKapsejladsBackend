package com.example._3sem24timersbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class BoatModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter @Setter
  private int boatId;
  @Getter @Setter
  private String boatType;

public BoatModel(){

}

public BoatModel(int boatId, String boatType){
  this.boatId = boatId;
  this.boatType = boatType;
}
}
