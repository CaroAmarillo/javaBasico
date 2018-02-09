package com.Caro.TpFinal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Caro.TpFinal.Model.DaoEmpleado;
import com.Caro.TpFinal.Model.DaoOrdenDeTrabajo;
import com.Caro.TpFinal.Model.DaoOrdenRepuesto;
import com.Caro.TpFinal.Model.DaoPropietario;
import com.Caro.TpFinal.Model.DaoRepuesto;
import com.Caro.TpFinal.Model.OrdenDeTrabajo;
import com.Caro.TpFinal.Model.OrdenRepuesto;

@Controller
@SuppressWarnings("unused")
public class MainController {

	
	@Autowired
	private DaoEmpleado daoEmpleado;
	@Autowired
	private DaoOrdenDeTrabajo daoOrdenDeTrabajo;
	@Autowired
	private DaoOrdenRepuesto daoOrdenRepuesto;
	@Autowired
	private DaoPropietario daoPropietario;
	@Autowired
	private DaoRepuesto daoRepuesto;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("index");		
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearOrdenDeTrabajo", method = RequestMethod.GET)
	public ModelAndView crearOrdenGet(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("ordenDeTrabajo", new OrdenDeTrabajo());
		modelAndView.addObject("propietarios", daoPropietario.findAll());
		modelAndView.addObject("empleados", daoEmpleado.findAll());
		
		modelAndView.setViewName("crearOrdenDeTrabajo");
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearOrden", method = RequestMethod.POST)
	public ModelAndView crearOrdenPost(@ModelAttribute OrdenDeTrabajo ordenDeTrabajo){
		
		ModelAndView modelAndView = new ModelAndView();
		daoOrdenDeTrabajo.save(ordenDeTrabajo);
		
		modelAndView.addObject("repuestos", daoRepuesto.findAll());
		modelAndView.addObject("orden", ordenDeTrabajo);
		modelAndView.addObject("ordenRepuesto", new OrdenRepuesto());
		modelAndView.setViewName("agregarRepuesto");
		
		return modelAndView;
	}
	
//	@RequestMapping(value = "/listarPropietarios", method = RequestMethod.GET)
//	public ModelAndView listarPropietarios() {
//		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("propietarios", daoPropietario.findAll());
//		modelAndView.setViewName("listadoPropietarios");		
//		
//		return modelAndView;
//	}
//	
//	@RequestMapping(value = "/crearOrdenRepuesto", method = RequestMethod.GET)
//	public ModelAndView crearOrdenRepuestoGet(@RequestParam("id") long idOrdenDeTrabajo) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("orden", daoOrdenDeTrabajo.findOne(idOrdenDeTrabajo));
//		modelAndView.addObject("repuestos", daoRepuesto.findAll());
//		modelAndView.addObject("ordenRepuesto", new OrdenRepuesto());
//		
//		modelAndView.setViewName("agregarRepuesto");
//		return modelAndView;
//	}
//	
//	@RequestMapping(value = "/crearOrdenRepuesto", method = RequestMethod.POST)
//	public ModelAndView crearOrdenRepuestoPost(@ModelAttribute OrdenRepuesto ordenRepuesto, 
//			@ModelAttribute OrdenDeTrabajo ordenDeTrabajo){
//		
//		OrdenDeTrabajo ordenAux = daoOrdenDeTrabajo.findOne(ordenDetrabajo.getIdOrden());
//		ModelAndView modelAndView = new ModelAndView();
//		ordenRepuesto.setOrdenDeTrabajo(ordenAux);
//		daoOrdenRepuesto.save(ordenRepuesto);
//		modelAndView.addObject("ordenes", daoOrdenDeTrabajo.findAll());
//		modelAndView.setViewName("listadoOrdenes");
//		
//		return modelAndView;
//	}
//	
//	@RequestMapping(value = "/listarOrdenes", method = RequestMethod.GET)
//	public ModelAndView listarOrdenes(){
//		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("ordenes", daoOrden.findAll());
//		modelAndView.setViewName("listadoOrdenes");
//		
//		return modelAndView;
//	}
//	
//	@RequestMapping(value = "/crearPropietario", method = RequestMethod.GET)
//	public ModelAndView crearPropietarioGet(){
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("propietario", new Propietario());
//		modelAndView.setViewName("crearPropietario");
//		
//		return modelAndView;
//	}
//	
//	@RequestMapping(value = "/crearPropietario", method = RequestMethod.POST)
//	public ModelAndView crearPropietarioPost(@ModelAttribute Propietario propietario){
//		
//		ModelAndView modelAndView = new ModelAndView();
//		daoPropietario.save(propietario);
//		
//		modelAndView.addObject("orden", new Orden());
//		modelAndView.addObject("propietarios", daoPropietario.findAll());
//		modelAndView.addObject("empleados", daoEmpleado.findAll());
//		
//		modelAndView.setViewName("crearOrden");
//		
//		return modelAndView;
//	}
//	@RequestMapping(value = "/verDetalle", method = RequestMethod.GET)
//	public ModelAndView verDetalles(@RequestParam("id") long idOrden){
//		
//		ModelAndView modelAndView = new ModelAndView();
//		
//		Orden orden = daoOrden.findOne(idOrden);
//		
//		int total = 0;
//		
//		for (OrdenRepuesto ordenRepuesto : orden.getOrdenRepuestosO()) {
//			
//			total += ordenRepuesto.getRepuesto().getCostoRepuesto()*ordenRepuesto.getCantidadRepuestos();
//		}
//		total += orden.getCantHorasManoDeObra()*350;
//		
//		orden.setTotal(total);
//		daoOrden.save(orden);
//		
//		modelAndView.addObject("orden", orden);
//		modelAndView.setViewName("verDetalle");
//		
//		return modelAndView;
//	}
//	

}
