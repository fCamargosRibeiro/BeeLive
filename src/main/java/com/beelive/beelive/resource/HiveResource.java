package com.beelive.beelive.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beelive.beelive.domain.Hive;
import com.beelive.beelive.service.HiveService;

@RestController
public class HiveResource {
	
	@Autowired
	private HiveService hiveService;

	@RequestMapping(method = RequestMethod.GET, path = "/hive", value = "/hive", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Hive>> findAll() {
		return new ResponseEntity<List<Hive>>(hiveService.findAllHives(), HttpStatus.OK); 
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Hive> save(@RequestBody Hive hive) {
		return new ResponseEntity<Hive>(hiveService.save(hive), HttpStatus.OK); 
    }
	
	@RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Hive> put(@RequestBody Hive hive) {
		return new ResponseEntity<Hive>(hiveService.put(hive), HttpStatus.OK); 
    }

}
