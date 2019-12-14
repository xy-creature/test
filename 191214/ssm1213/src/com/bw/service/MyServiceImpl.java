package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.mapper.MyMapper;
import com.bw.pojo.City;
import com.bw.pojo.Country;
import com.bw.pojo.QueryModel;
import com.github.pagehelper.PageHelper;

@Service
public class MyServiceImpl implements MyService {
	@Autowired
	private MyMapper myMapper;

	@Override
	public List<City> allCity() {
		return myMapper.allCity();
	}

	@Override
	public int deleteCity(long id) {
		return myMapper.deleteCity(id);
	}

	@Override
	public List<Country> allCountry() {
		return myMapper.allCountry();
	}

	@Override
	public int saveCity(City city) {
		return myMapper.saveCity(city);
	}

	@Override
	public City getCityById(long id) {
		return myMapper.getCityById(id);
	}

	@Override
	public int updateCity(City city) {
		return myMapper.updateCity(city);
	}

	@Override
	public List<City> queryCity(QueryModel m) {
		return myMapper.queryCity(m);
	}

	@Override
	public List<City> queryCityPage(QueryModel m) {
		PageHelper.startPage(m.getPageNum(),m.getPageSize());
		List<City> list = myMapper.queryCity(m);
		return list;
	}

	@Override
	public int delete(int[] array) {
		return myMapper.delete(array);
	}

	@Override
	public List<Country> allCountry2() {
		return myMapper.allCountry2();
	}

	@Override
	public List<City> getCityByCountry(long id) {
		return myMapper.getCityByCountry(id);
	}
}
