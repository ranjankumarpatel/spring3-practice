package org.pract.spring.spring_boot_auth2.dao;

import org.pract.spring.spring_boot_auth2.entity.AdminAccount;
import org.springframework.data.repository.CrudRepository;

public interface AdminAccountRepository extends CrudRepository <AdminAccount, Long> {

    public AdminAccount findByAdminName(String adminName);

}
