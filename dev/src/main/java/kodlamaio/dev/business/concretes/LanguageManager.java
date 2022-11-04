package kodlamaio.dev.business.concretes;

import java.util.List;

import kodlamaio.dev.business.abstracts.LanguageService;
import kodlamaio.dev.dataAccess.abstracts.LanguageRepository;
import kodlamaio.dev.entities.concretes.ProgrammingLanguage;

public class LanguageManager implements LanguageService {
	
	private LanguageRepository _languageRepository;
	
	
	public LanguageManager(LanguageRepository languageRepository) {
		this._languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return _languageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getName() == null) {
			throw new Exception("Programlama dili boş geçilemez");
		}
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
