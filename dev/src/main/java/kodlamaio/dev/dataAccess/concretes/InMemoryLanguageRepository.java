package kodlamaio.dev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import kodlamaio.dev.dataAccess.abstracts.LanguageRepository;
import kodlamaio.dev.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
	
	List<ProgrammingLanguage> _languages;
	
	
	public InMemoryLanguageRepository() {
		_languages = new ArrayList<ProgrammingLanguage>();
		_languages.add(new ProgrammingLanguage(1,"C#"));
		_languages.add(new ProgrammingLanguage(2,"Java"));

	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return _languages;
	}


	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		_languages.add(programmingLanguage);
	}


	@Override
	public void update(ProgrammingLanguage  programmingLanguage) {
		for (ProgrammingLanguage progLanguage : _languages) {
			if (progLanguage.getId() == programmingLanguage.getId()) {
				_languages.set(progLanguage.getId(), programmingLanguage);
			}
		}
		
	}


	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		_languages.remove(programmingLanguage);
		
	}


	@Override
	public ProgrammingLanguage getById(int id) {
		return _languages.get(id);
		
	}
	
	
}
