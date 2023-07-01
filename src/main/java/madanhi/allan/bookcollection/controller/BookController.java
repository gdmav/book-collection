package madanhi.allan.bookcollection.controller;

import madanhi.allan.bookcollection.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
    @PostMapping("/add")
   public String add(Book book){
       String view= null;

       return view;

   }

   @GetMapping("/list")
    public String list(){
        String view= "view.html";

        return view;

    }
    @PutMapping("/")
    public String update(){
        String view= null;

        return view;

    }

    public String delete(){
        String view= null;

        return view;

    }

}
