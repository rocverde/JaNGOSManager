package eu.jangos.manager.model;
// Generated 07-f�vr.-2016 19:53:36 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Realm generated by hbm2java
 */
public class Realm  implements java.io.Serializable {


     private Integer id;
     private Realmtimezone realmtimezone;
     private Realmtype realmtype;
     private String name;
     private String address;
     private int port;
     private float population;
     private int maxPlayers;
     private int countPlayers;
     private boolean invalid;
     private boolean offline;
     private boolean showversion;
     private boolean newplayers;
     private boolean recommended;
     private Set accounts = new HashSet(0);
     private Set realmAccounts = new HashSet(0);

    public Realm() {
    }

	
    public Realm(Realmtimezone realmtimezone, Realmtype realmtype, String name, String address, int port, float population, int maxPlayers, int countPlayers, boolean invalid, boolean offline, boolean showversion, boolean newplayers, boolean recommended) {
        this.realmtimezone = realmtimezone;
        this.realmtype = realmtype;
        this.name = name;
        this.address = address;
        this.port = port;
        this.population = population;
        this.maxPlayers = maxPlayers;
        this.countPlayers = countPlayers;
        this.invalid = invalid;
        this.offline = offline;
        this.showversion = showversion;
        this.newplayers = newplayers;
        this.recommended = recommended;
    }
    public Realm(Realmtimezone realmtimezone, Realmtype realmtype, String name, String address, int port, float population, int maxPlayers, int countPlayers, boolean invalid, boolean offline, boolean showversion, boolean newplayers, boolean recommended, Set accounts, Set realmAccounts) {
       this.realmtimezone = realmtimezone;
       this.realmtype = realmtype;
       this.name = name;
       this.address = address;
       this.port = port;
       this.population = population;
       this.maxPlayers = maxPlayers;
       this.countPlayers = countPlayers;
       this.invalid = invalid;
       this.offline = offline;
       this.showversion = showversion;
       this.newplayers = newplayers;
       this.recommended = recommended;
       this.accounts = accounts;
       this.realmAccounts = realmAccounts;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Realmtimezone getRealmtimezone() {
        return this.realmtimezone;
    }
    
    public void setRealmtimezone(Realmtimezone realmtimezone) {
        this.realmtimezone = realmtimezone;
    }
    public Realmtype getRealmtype() {
        return this.realmtype;
    }
    
    public void setRealmtype(Realmtype realmtype) {
        this.realmtype = realmtype;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPort() {
        return this.port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    public float getPopulation() {
        return this.population;
    }
    
    public void setPopulation(float population) {
        this.population = population;
    }
    public int getMaxPlayers() {
        return this.maxPlayers;
    }
    
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }
    public int getCountPlayers() {
        return this.countPlayers;
    }
    
    public void setCountPlayers(int countPlayers) {
        this.countPlayers = countPlayers;
    }
    public boolean isInvalid() {
        return this.invalid;
    }
    
    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }
    public boolean isOffline() {
        return this.offline;
    }
    
    public void setOffline(boolean offline) {
        this.offline = offline;
    }
    public boolean isShowversion() {
        return this.showversion;
    }
    
    public void setShowversion(boolean showversion) {
        this.showversion = showversion;
    }
    public boolean isNewplayers() {
        return this.newplayers;
    }
    
    public void setNewplayers(boolean newplayers) {
        this.newplayers = newplayers;
    }
    public boolean isRecommended() {
        return this.recommended;
    }
    
    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }
    public Set getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(Set accounts) {
        this.accounts = accounts;
    }
    public Set getRealmAccounts() {
        return this.realmAccounts;
    }
    
    public void setRealmAccounts(Set realmAccounts) {
        this.realmAccounts = realmAccounts;
    }




}


