package cn.loveiszero.service;

import java.util.List;

import cn.loveiszero.entity.KejuAssistant;

public interface KejuAssistantService {
	List<KejuAssistant> findAll();
	void insertKejuQA(KejuAssistant kejuAssistant);
}
