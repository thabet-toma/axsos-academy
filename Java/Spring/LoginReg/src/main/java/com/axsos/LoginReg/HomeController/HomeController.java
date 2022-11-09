package com.axsos.LoginReg.HomeController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.LoginReg.Services.BookService;
import com.axsos.LoginReg.Services.UserService;
import com.axsos.LoginReg.models.Book;
import com.axsos.LoginReg.models.LoginUser;
import com.axsos.LoginReg.models.User;

@Controller
public class HomeController {
    
    @Autowired
    private UserService userServ;
    @Autowired
    private BookService bookServ;
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        userServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("user", newUser);
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
 
        session.setAttribute("userId", user.getId());
        return "redirect:/home";
    }
    @GetMapping("/home")
    public String home(HttpSession session,Model model) {
    	if( session.getAttribute("userId")!=null) {
            Long user_id = (Long) session.getAttribute("userId");
            User thisUser = userServ.findUserById(user_id);
            model.addAttribute("user", thisUser);
            

    		model.addAttribute("AllBook", bookServ.AllBooks());
    		
    	return "home.jsp";
    }
    	else {
    		return "redirect:/";
    		}
    	}
    @GetMapping("/logout")
    public String logout(HttpSession session) { 
            session.invalidate();
            return "redirect:/";
    
}
    @GetMapping("/AddBook")
    public String AddBook(@ModelAttribute("book") Book book) {
    	return"addBook.jsp";
    	
    }
    @PostMapping("/CreateBook")
    public String CreateBook(@Valid @ModelAttribute("book") Book book, BindingResult result,Model model,HttpSession session)
    {
    	if(result.hasErrors()) {
    		return "addBook.jsp";
    	}
    	else {
    		
    		bookServ.create(book);
    		
    		
    		return"redirect:/home";
    		
    	}
    }
    @GetMapping("/book/{idB}")
    public String show(@PathVariable("idB") Long idB ,Model model,HttpSession session){
    	model.addAttribute("book",bookServ.findBook(idB));
    	Long userId =(Long)session.getAttribute("userId");
    	
    	model.addAttribute("userId",userId );
    	return "show.jsp";
    }
    @RequestMapping("/update/{id}")
    public String edit(@Valid @ModelAttribute("updatebook") Book book ,BindingResult result ,Model model,HttpSession session,@PathVariable("id")Long id ) {
//
        model.addAttribute("book", bookServ.findBook(id));
//        User user =userServ.findUserById((Long)session.getAttribute("user_id"));
//        model.addAttribute("user",user);
        return "update.jsp";
    }


    @PutMapping("/edit/{id}")
    public String createBooke(@Valid @ModelAttribute("updatebook") Book book ,BindingResult result ,Model model,HttpSession session) {
        if (result.hasErrors()) {
            return "update.jsp";
        } else {

             bookServ.updatebook(book);
            return "redirect:/home";
        }
    }
    //--------------------------------------------------------------------------------
    @RequestMapping("/delete/{id}")
    public String delete(Model model,@PathVariable("id")Long id ) {


        bookServ.delete(id);
//        User user =userServ.findUserById((Long)session.getAttribute("user_id"));
//        model.addAttribute("user",user);
        return "redirect:/home";
    }

    
    }