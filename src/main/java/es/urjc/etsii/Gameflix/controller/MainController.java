package es.urjc.etsii.Gameflix.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.urjc.etsii.Gameflix.Service.UsuariosService;
import es.urjc.etsii.Gameflix.msg.Login;
import es.urjc.etsii.Gameflix.msg.Usuario;

@Controller
public class MainController {
	
	@Autowired
	UsuariosService	usuariosService;

	@RequestMapping("/")
    public String inicio(Map<String, Object> model) {
		
        return "login";
    }
	
	 @RequestMapping(value = "/", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    Usuario user = usuariosService.validarUser(login);
	    if (null != user) {
	    mav = new ModelAndView("welcome");
	    } else {
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
}
