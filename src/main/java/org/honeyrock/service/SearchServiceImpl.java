package org.honeyrock.service;

import java.util.ArrayList;
import java.util.List;

import org.honeyrock.domain.PointVO;
import org.honeyrock.mapper.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Setter(onMethod_ = @Autowired)
	private SearchMapper mapper;

	@Override
	public List<PointVO> searchPoint(String keyword) {
		return mapper.searchPoint(keyword);
	}

	@Override
	public List<String> getName() {

		List<String> pointName = mapper.getPointName();
		
		List<String> list = pointName;
		list.addAll(pointName);
		
		//중복제거
		List<String> resultList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
		    if (!resultList.contains(list.get(i))) {
		        resultList.add(list.get(i));
		    }
		}

		return resultList;
	}

	@Override
	public List<PointVO> getList() {
		return mapper.getList();
	}

}
