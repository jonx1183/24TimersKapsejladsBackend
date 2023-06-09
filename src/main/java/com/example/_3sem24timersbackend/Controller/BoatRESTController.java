package com.example._3sem24timersbackend.Controller;

import com.example._3sem24timersbackend.Model.BoatModel;
import com.example._3sem24timersbackend.Service.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:63342")
public class BoatRESTController {
  @Autowired
  private BoatService boatService;

  @GetMapping("/ListOfBoats")
  public List<BoatModel>getListOgBoats(){
    List<BoatModel> lstBoats = boatService.getListOfBoats();

    return lstBoats;
  }

  @PostMapping("/CreateBoat")
  public ResponseEntity<BoatModel> createBoat(@RequestBody BoatModel boat){
    boatService.createBoat(boat);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping("/updateBoat/{boatId}")
  public ResponseEntity<BoatModel>updateBoat(@PathVariable("boatId") int boatId,
                                             @RequestBody BoatModel boat){
    boat.setBoatId(boatId);
    BoatModel updatedBoat = boatService.updateBoatModel(boat);
    return new ResponseEntity<>(updatedBoat, HttpStatus.OK);

  }

  @DeleteMapping("/DeleteBoat")
  public void deleteBoat(int id){
    boatService.deleteBoatById(id);
  }
}
