package com.companyname.springapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.companyname.springapp.domain.Account;

@Repository(value = "accountDao")
public class JPAAccountDao implements AccountDao {

    private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Account> getAccountList() {
        return em.createQuery("select acc from Account acc order by acc.id").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveAccount(Account acc) {
        em.merge(acc);
    }

}