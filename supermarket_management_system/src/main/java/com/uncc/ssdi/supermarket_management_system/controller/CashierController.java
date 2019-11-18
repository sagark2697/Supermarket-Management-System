package com.uncc.ssdi.supermarket_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.uncc.ssdi.supermarket_management_system.entity.Cashier;
import com.uncc.ssdi.supermarket_management_system.service.CashierService;
import com.uncc.ssdi.supermarket_management_system.vo.CashierVo;

@RestController
@RequestMapping({ "/api" })
public class CashierController {

	@Autowired
	private CashierService cashierService;
	
	
	@RequestMapping(value="/cashierdetails", method= RequestMethod.GET)
	public List<Cashier> findAllCashiers(){
		
		return cashierService.findAllCashiers();
		
	}
	
	@RequestMapping(value = "/addcashier", method = { RequestMethod.POST })
	public ResponseEntity<CashierVo> addUser(@RequestBody CashierVo cashierVo) {
		return cashierService.addCashier(cashierVo);
	}
	
	@RequestMapping(value = "/deletecashier/{id}", method = { RequestMethod.DELETE })
	public ResponseEntity<?> deleteCashier(@PathVariable(value = "id") int cashierId) {
		
		return cashierService.deleteCashier(cashierId);
	}
	
}
