package cn.loveiszero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.loveiszero.entity.KejuAssistant;
import cn.loveiszero.service.KejuAssistantService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/keju")
public class KejuAssistantController {
	
	@Autowired
	private KejuAssistantService kejuAssistantService;

	/**
	 * 查询所有
	 */
	@RequestMapping(value="/kejuList",method= {RequestMethod.GET, RequestMethod.POST})  
	@ApiOperation(value="获取所有的列表",notes="不需要传递参数")
	public List<KejuAssistant> allList(){  
		return kejuAssistantService.findAll();  
	}
	
	@RequestMapping(value="/insertQA")  
	public void insertKejuQA(KejuAssistant kejuAssistant) {
		kejuAssistant.setQuestionDetail("问题2");
		kejuAssistant.setAnswerDetail("答案2");
		kejuAssistantService.insertKejuQA(kejuAssistant);
		
	}
	
}
