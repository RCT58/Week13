package com.promineotech.jeep.controller;

public class DefaultJeepSalesController {
	@RestController
	@RequestMapping("/jeeps")
	public class DefaultJeepSalesController implements JeepSalesController {

	  private final JeepSalesService jeepSalesService;

	  public DefaultJeepSalesController(JeepSalesService jeepSalesService) {
	    this.jeepSalesService = jeepSalesService;
	  }

	  @GetMapping
	  @ResponseStatus(code = HttpStatus.OK)
	  public List<Jeep> fetchJeeps(@RequestParam JeepModel model, 
	                               @RequestParam String trim) {
	    return jeepSalesService.fetchJeeps(model, trim);
	  }
	}

}
