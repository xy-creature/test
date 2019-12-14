package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.pojo.City;
import com.bw.pojo.Country;
import com.bw.pojo.QueryModel;
import com.bw.service.MyService;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	
	@RequestMapping("allcity.do")
	public String allcity(Model model){
		List<City> list = myService.allCity();
		model.addAttribute("list", list);
		return "allcity";
	}
	
	@RequestMapping("delete.do")
	public String delete(long id){
		myService.deleteCity(id);
		return "redirect:querycitypage.do";
	}
	@RequestMapping("toadd.do")
	public String toadd(Model model){
		List<Country> list = myService.allCountry();//全查国家，用于在添加页面的下拉框中展示
		model.addAttribute("list", list);
		return "add";
	}
	@RequestMapping("add.do")
	public String add(City city){
		myService.saveCity(city);
		return "redirect:querycitypage.do";
	}
	@RequestMapping("toupdate.do")
	public String toupdate(long id,Model model){
		City city = myService.getCityById(id);//根据id获取对应城市的信息，用于回显
		List<Country> list = myService.allCountry();//获取所有国家，用于下拉框
		model.addAttribute("city", city);
		model.addAttribute("list", list);
		return "update";
	}
	@RequestMapping("update.do")
	public String update(City city){
		myService.updateCity(city);
		return "redirect:querycitypage.do";
	}
	
	@RequestMapping("querycity.do")
	public String querycity(QueryModel m,Model model){
		List<City> list = myService.queryCity(m);
		model.addAttribute("list", list);
		model.addAttribute("m", m);
		return "querycity";
	}
	@RequestMapping("querycitypage.do")
	public String querycitypage(QueryModel m,Model model){
		List<City> list = myService.queryCityPage(m);
		List<Country> countries = myService.allCountry();//获取所有国家，用于下拉框
		model.addAttribute("countries", countries);
		PageInfo<City> pi = new PageInfo<>(list);
		model.addAttribute("pi", pi);
		model.addAttribute("m", m);
		return "querycitypage";
	}
	@RequestMapping("delete2.do")
	public String delete2(int[] ids,Model model){
		myService.delete(ids);
		return "querycitypage";
	}
	@RequestMapping("allcountry.do")
	public String allcountry(Model model){
		List<Country> list = myService.allCountry2();
		model.addAttribute("list", list);
		return "allcountry";
	}
	@RequestMapping("getcitybycid.do")
	public String getcitybycid(long id,Model model){
		List<City> list = myService.getCityByCountry(id);
		model.addAttribute("list", list);
		return "getcitybycid";
	}
}
