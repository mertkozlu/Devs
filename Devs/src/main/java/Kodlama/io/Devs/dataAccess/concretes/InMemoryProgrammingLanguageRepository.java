package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
        programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return null;
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
        return null;
    }

    @Override
    public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) {
        return null;
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {

    }
}
