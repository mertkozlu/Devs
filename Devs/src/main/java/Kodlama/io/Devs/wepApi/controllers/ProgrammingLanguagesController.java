package Kodlama.io.Devs.wepApi.controllers;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAll")
    List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }

    @GetMapping("/getById")
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageService.getById(id);
    }

    @PutMapping("/update")
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.update(programmingLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(int id) {
        programmingLanguageService.delete(id);
    }

}
