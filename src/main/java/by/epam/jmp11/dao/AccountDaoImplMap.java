package by.epam.jmp11.dao;

import by.epam.jmp11.model.Account;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by Vitali on 02.10.2016.
 */
@Repository
public class AccountDaoImplMap implements AccountDao{
    private Map<String, Account> accounts = new HashMap<>();

    {
        add();
        add();
    }

    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Account add() {
        String id = UUID.randomUUID().toString();
        Account account = new Account(0, id);
        accounts.put(id, account);
        return account;
    }

    @Override
    public Account get(String id) {
        return accounts.get(id);
    }

    @Override
    public Account putMoney(String id, int value) {
        Account account = accounts.get(id);
        account.setMoney(value);
        return account;
    }
}
