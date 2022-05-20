package uz.pdp.securityservice.controller;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uz.pdp.securityservice.model.Role;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/")
    public String home(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("user",auth);
        return "index";
    }
    @GetMapping("/dashboard")
    public String dashboard(HttpSecurity httpSecurity){
        try {
          httpSecurity.authorizeRequests().antMatchers(
                "/dashboard"
            ).hasAnyRole(String.valueOf(new Role("ROLE_ADMIN")));
            return "admin-panel";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
