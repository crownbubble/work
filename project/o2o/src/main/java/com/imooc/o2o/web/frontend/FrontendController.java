package com.imooc.o2o.web.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/frontend")
public class FrontendController {
	/**
	 * 商品列表页路由
	 * @return
	 */
	@RequestMapping(value="/shoplist",method=RequestMethod.GET)
	private String showShopList() {
		return "frontend/shoplist";
	}
	@RequestMapping(value="/index",method=RequestMethod.GET)
	private String index() {
		return "frontend/index";
	}
	/**
	 * 店铺详情页路由
	 * @return
	 */
	@RequestMapping(value="/shopdetail",method=RequestMethod.GET)
	private String showShopDetail() {
		return "frontend/shopdetail";
	}
}
