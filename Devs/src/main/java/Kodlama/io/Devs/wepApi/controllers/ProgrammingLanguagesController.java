package Kodlama.io.Devs.wepApi.controllers;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;
    @Autowired
    public ProgrammingLanguagesController (ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }
    @GetMapping("/getAll")
    public List<ProgrammingLanguage>getAll() {
        return programmingLanguageService.getAll();
    }
    @PostMapping("/add")
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
        return programmingLanguageService.add(programmingLanguage);
    }
    @GetMapping("/getById")
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageService.getById(id);
    }
    @PutMapping("/update")
    public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) {
        return programmingLanguageService.update(programmingLanguage);
    }
    @DeleteMapping("/delete")
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.delete(programmingLanguage);
    }

}
