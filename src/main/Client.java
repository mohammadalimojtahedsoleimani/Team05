package main;

import main.Enums.AccessLevel;
import main.Enums.ActionResult;

import java.util.Date;

public class Client extends User {
    String address;
    ActionResult makeOrder(Order order){
        return ActionResult.SUCCESS;
    }
    ActionResult revokeOrder(int id){
        return ActionResult.SUCCESS;
    }

    public Client( String userName, String password, AccessLevel accessLevel, Date registrationDate, Date lastLoginDate, String address) {
        super( userName, password, accessLevel, registrationDate, lastLoginDate);
        this.address = address;
    }
}
