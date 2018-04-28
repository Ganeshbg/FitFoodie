package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import io.javabrains.springbootstarter.topic.Topic;

@Service
public class AreaService {
	
//	@Autowired
//	private AreaRepository areaRepository;
	
	
	private static HashMap<String, Area> areaMap = new HashMap<String,Area>(){
		{
		put("80306",new Area("80306","westminster","CO","USA"));
		put("80307",new Area("80307","Arvada","CO","USA"));
		}
		
	};
		
	
	
	
	
	
	
	
	
	
//	public List<Area> getAllAreas(){
//		List<Area> areas = new ArrayList<>();
//		areaRepository.findAll().forEach(areas::add);
//		return areas;
//	}
//
	public Area getArea(String zip) {
		
		if(areaMap.containsKey(zip)) {
			return areaMap.get(zip);
		}
		else {
			return null;
		}
		
		
		//return areaRepository.findOne(zip);
	}
//	
	public void addArea(Area area) {
		//areaRepository.save(area);
	}
	
//	public void updateArea(Area area) {
//		areaRepository.save(area);
//	}
//	
//	public void deleteArea(String zip) {
//		areaRepository.delete(zip);
//	}
}
