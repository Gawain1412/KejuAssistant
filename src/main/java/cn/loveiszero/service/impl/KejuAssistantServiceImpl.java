package cn.loveiszero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.loveiszero.entity.KejuAssistant;
import cn.loveiszero.repository.KejuAssistantRepository;
import cn.loveiszero.service.KejuAssistantService;

@Service
public class KejuAssistantServiceImpl implements KejuAssistantService {

	@Autowired
	private KejuAssistantRepository kejuAssistantRepository;
	@Override
	public List<KejuAssistant> findAll() {
		return kejuAssistantRepository.findAll();
	}
	@Override
	public void insertKejuQA(KejuAssistant kejuAssistant) {
		kejuAssistantRepository.save(kejuAssistant);
		
	}

}
