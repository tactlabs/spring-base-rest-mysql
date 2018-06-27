package org.tact.base.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tact.mybatis.mapper.CityMapper;
import org.tact.mybatis.mapper.UsersMapper;

@RestController
@RequestMapping(value = "/base")
public class BaseController {
	
    @RequestMapping(value = "", method = RequestMethod.GET)
    public <T> T listUsers() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        
        return (T) map;
    }    
    
    @Autowired
    private CityMapper cityMapper;
    
    @Autowired
    private UsersMapper userMapper;
    
    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public <T> T getCity() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("city", cityMapper.findByState("CA"));
        
        return (T) map;
    }
    
    @RequestMapping(value = "/city/{state}", method = RequestMethod.GET)
    public <T> T getCity(
    	@PathVariable(value = "state") String state	
    	) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("city", cityMapper.findByStates(state));
        
        return (T) map;
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public <T> T getAllUsers(    		
    	) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("users", userMapper.findAll());
        
        return (T) map;
    }
}
