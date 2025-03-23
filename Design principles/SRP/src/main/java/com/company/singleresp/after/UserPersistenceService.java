package com.company.singleresp.after;

public class UserPersistenceService {



    public static void storeUserdata(User user) {
        Store store = new Store();
        store.store(user);
    }
}
