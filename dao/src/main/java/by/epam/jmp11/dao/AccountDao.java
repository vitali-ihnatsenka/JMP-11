package by.epam.jmp11.dao;

import by.epam.jmp11.model.Account;

import java.util.List;

/**
 * Created by Vitali on 02.10.2016.
 */
public interface AccountDao {
    List<Account> getAll();
    Account add();
    Account get(String id);
    Account putMoney(String id, int value);
}
