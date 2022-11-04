package kodlamaio.dev.business.abstracts;
import kodlamaio.dev.entities.concretes.ProgrammingLanguage;
import java.util.List;

public interface LanguageService {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage  programmingLanguage);	
	void delete(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage getById(int id);
}
