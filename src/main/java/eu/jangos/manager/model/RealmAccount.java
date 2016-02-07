package eu.jangos.manager.model;

/**
 * RealmAccount generated by hbm2java
 */
public class RealmAccount  implements java.io.Serializable {


     private RealmAccountId id;
     private Account account;
     private Realm realm;
     private byte numChars;

    public RealmAccount() {
    }

    public RealmAccount(RealmAccountId id, Account account, Realm realm, byte numChars) {
       this.id = id;
       this.account = account;
       this.realm = realm;
       this.numChars = numChars;
    }
   
    public RealmAccountId getId() {
        return this.id;
    }
    
    public void setId(RealmAccountId id) {
        this.id = id;
    }
    public Account getAccount() {
        return this.account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }
    public Realm getRealm() {
        return this.realm;
    }
    
    public void setRealm(Realm realm) {
        this.realm = realm;
    }
    public byte getNumChars() {
        return this.numChars;
    }
    
    public void setNumChars(byte numChars) {
        this.numChars = numChars;
    }




}

