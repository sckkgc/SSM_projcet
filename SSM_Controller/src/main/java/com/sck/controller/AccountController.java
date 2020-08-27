package com.sck.controller;
import com.sck.pojo.Account;
import com.sck.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账号的控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired//记住给注解，不然不给玩，就是没有注入成功
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有");
        //经初步测试结果为true，接下来应该调用service，完成查询账号
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);//存储到request域中，最后交由视图展示。
        return "list";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(HttpServletRequest request, HttpServletResponse response, Account account) throws IOException {
        accountService.saveAccount(account);
       response.sendRedirect(request.getContextPath()+"/account/findAll");
        return "list";
    }
}
