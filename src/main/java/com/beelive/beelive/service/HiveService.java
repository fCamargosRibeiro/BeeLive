package com.beelive.beelive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beelive.beelive.domain.Hive;
import com.beelive.beelive.repository.HiveRepository;

@Service
public class HiveService {

	@Autowired
	private HiveRepository hiveRepository;

	public List<Hive> findAllHives() {
		return hiveRepository.findAll();
	}

	public Hive save(Hive hive) {
		return hiveRepository.save(hive);
	}

	public Hive put(Hive hive) {
		return hiveRepository.save(hive);
	}

}
