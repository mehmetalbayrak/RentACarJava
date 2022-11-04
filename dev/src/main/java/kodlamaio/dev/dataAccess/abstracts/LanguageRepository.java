package kodlamaio.dev.dataAccess.abstracts;

import java.util.List;

import kodlamaio.dev.entities.concretes.ProgrammingLanguage;

public interface LanguageRepository {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage  programmingLanguage);	
	void delete(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage getById(int id);


}
