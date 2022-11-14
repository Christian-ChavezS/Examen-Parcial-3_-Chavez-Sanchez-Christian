package objetos.parcial3.examen;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class TravelAgency {

    private List<UserAccount> userAccountList = new LinkedList<>();



    public String addUserAccount(UserAccount userAccount) {

        if ((userAccount.getId() == null){
            throw new AccountNotFoundException("Account not found");
        }




    }


    public UserAccount findAccount(String id) {


    }

    public UserAccount findAccountByEmail(String email) {

    }

    public UserAccount findAccountByPhoneNumber(String phoneNumber) {

    }


    public UserAccount removeAccount(String id) {


    }


}
