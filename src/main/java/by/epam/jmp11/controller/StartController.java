package by.epam.jmp11.controller;

import by.epam.jmp11.dao.AccountDao;
import by.epam.jmp11.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/app")
public class StartController {

    @Autowired
    AccountDao accountDao;

    @RequestMapping(method = RequestMethod.GET)
    public String start(ModelMap model) {
        return jumpStart(model);
    }

    @RequestMapping(value = "addAccount", method = RequestMethod.POST)
    public String add(ModelMap model) {
        accountDao.add();
        return jumpStart(model);
    }

    @RequestMapping(value = "setMoney", method = RequestMethod.POST)
    public String putMoney(ModelMap model, @RequestParam String accountId, @RequestParam String value) {
        accountDao.putMoney(accountId, Integer.parseInt(value));
        return jumpStart(model);
    }

    private String jumpStart(ModelMap model){
        List<Account> accounts = accountDao.getAll();
        model.addAttribute("accounts", accounts);
        return "start";
    }
}
