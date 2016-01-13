package eu.icred.model.node;

import java.util.HashMap;
import java.util.Map;

import eu.icred.model.annotation.ChildList;
import eu.icred.model.annotation.Node;
import eu.icred.model.node.entity.Account;
import eu.icred.model.node.entity.Company;
import eu.icred.model.node.entity.Property;

@Node
public class Data extends AbstractNode {
    @ChildList
    protected Map<String, Company>  companies;
    @ChildList
    protected Map<String, Property> properties;
    @ChildList
    protected Map<String, Account>  accounts;

    public Map<String, Company> getCompanies() {
        return getCompanies(true);
    }

    public Map<String, Company> getCompanies(boolean lazy) {
        if (lazy && companies == null)
            companies = new HashMap<String, Company>();

        return companies;
    }

    public void setCompanies(Map<String, Company> companies) {
        this.companies = companies;
    }

    public Map<String, Property> getProperties() {
        return getProperties(true);
    }

    public Map<String, Property> getProperties(boolean lazy) {
        if (lazy && properties == null)
            properties = new HashMap<String, Property>();

        return properties;
    }

    public void setProperties(Map<String, Property> properties) {
        this.properties = properties;
    }

    public Map<String, Account> getAccounts() {
        return getAccounts(true);
    }

    public Map<String, Account> getAccounts(boolean lazy) {
        if (lazy && accounts == null)
            accounts = new HashMap<String, Account>();

        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

}
