package sn.esmt.emplois.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.emplois.dao.CvRepository;
import sn.esmt.emplois.entities.CvEntity;

import java.util.List;
@RestController
@RequestMapping(value = "/cv")
@AllArgsConstructor

public class CvController {
    private CvRepository cvRepository;
    @PostMapping(path="/save")
    public CvEntity save(@RequestBody CvEntity cvEntity){
        return cvRepository.save(cvEntity);
    }
    @GetMapping(path="/all")
    public List<CvEntity> getAll(){
        return cvRepository.findAll();
    }

}
