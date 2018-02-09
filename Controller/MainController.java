
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.MagaliCeballos.TPFinal.Model.DaoEmpleado;
import com.MagaliCeballos.TPFinal.Model.DaoOrden;
import com.MagaliCeballos.TPFinal.Model.DaoOrdenRepuesto;
import com.MagaliCeballos.TPFinal.Model.DaoPropietario;
import com.MagaliCeballos.TPFinal.Model.DaoRepuesto;
import com.MagaliCeballos.TPFinal.Model.Orden;
import com.MagaliCeballos.TPFinal.Model.OrdenRepuesto;
import com.MagaliCeballos.TPFinal.Model.Propietario;

@Controller
public class MainController {
	@Autowired
	private DaoEmpleado daoEmpleado;
	@Autowired
	private DaoOrden daoOrden;
	@Autowired
	private DaoOrdenRepuesto daoOrdenRepuesto;
	@Autowired
	private DaoPropietario daoPropietario;
	@Autowired
	private DaoRepuesto daoRepuesto;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("home");		
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearOrden", method = RequestMethod.GET)
	public ModelAndView crearOrdenGet(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("orden", new Orden());
		modelAndView.addObject("propietarios", daoPropietario.findAll());
		modelAndView.addObject("empleados", daoEmpleado.findAll());
		
		modelAndView.setViewName("crearOrden");
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearOrden", method = RequestMethod.POST)
	public ModelAndView crearOrdenPost(@ModelAttribute Orden orden){
		
		ModelAndView modelAndView = new ModelAndView();
		daoOrden.save(orden);
		
		modelAndView.addObject("repuestos", daoRepuesto.findAll());
		modelAndView.addObject("orden", orden);
		modelAndView.addObject("ordenRepuesto", new OrdenRepuesto());
		modelAndView.setViewName("agregarRepuesto");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/listarPropietarios", method = RequestMethod.GET)
	public ModelAndView listarPropietarios() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("propietarios", daoPropietario.findAll());
		modelAndView.setViewName("listadoPropietarios");		
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearOrdenRepuesto", method = RequestMethod.GET)
	public ModelAndView crearOrdenRepuestoGet(@RequestParam("id") long idOrden) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("orden", daoOrden.findOne(idOrden));
		modelAndView.addObject("repuestos", daoRepuesto.findAll());
		modelAndView.addObject("ordenRepuesto", new OrdenRepuesto());
		
		modelAndView.setViewName("agregarRepuesto");
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearOrdenRepuesto", method = RequestMethod.POST)
	public ModelAndView crearOrdenRepuestoPost(@ModelAttribute OrdenRepuesto ordenRepuesto, 
			@ModelAttribute Orden orden){
		
		Orden ordenAux = daoOrden.findOne(orden.getIdOrden());
		ModelAndView modelAndView = new ModelAndView();
		ordenRepuesto.setOrden(ordenAux);
		daoOrdenRepuesto.save(ordenRepuesto);
		modelAndView.addObject("ordenes", daoOrden.findAll());
		modelAndView.setViewName("listadoOrdenes");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/listarOrdenes", method = RequestMethod.GET)
	public ModelAndView listarOrdenes(){
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("ordenes", daoOrden.findAll());
		modelAndView.setViewName("listadoOrdenes");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearPropietario", method = RequestMethod.GET)
	public ModelAndView crearPropietarioGet(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("propietario", new Propietario());
		modelAndView.setViewName("crearPropietario");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/crearPropietario", method = RequestMethod.POST)
	public ModelAndView crearPropietarioPost(@ModelAttribute Propietario propietario){
		
		ModelAndView modelAndView = new ModelAndView();
		daoPropietario.save(propietario);
		
		modelAndView.addObject("orden", new Orden());
		modelAndView.addObject("propietarios", daoPropietario.findAll());
		modelAndView.addObject("empleados", daoEmpleado.findAll());
		
		modelAndView.setViewName("crearOrden");
		
		return modelAndView;
	}
	@RequestMapping(value = "/verDetalle", method = RequestMethod.GET)
	public ModelAndView verDetalles(@RequestParam("id") long idOrden){
		
		ModelAndView modelAndView = new ModelAndView();
		
		Orden orden = daoOrden.findOne(idOrden);
		
		int total = 0;
		
		for (OrdenRepuesto ordenRepuesto : orden.getOrdenRepuestosO()) {
			
			total += ordenRepuesto.getRepuesto().getCostoRepuesto()*ordenRepuesto.getCantidadRepuestos();
		}
		total += orden.getCantHorasManoDeObra()*350;
		
		orden.setTotal(total);
		daoOrden.save(orden);
		
		modelAndView.addObject("orden", orden);
		modelAndView.setViewName("verDetalle");
		
		return modelAndView;
	}
	
	
}