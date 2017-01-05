package org.pract.spring.spring_boot_auth2.common.exception;

import org.pract.spring.spring_boot_auth2.util.AppUtil;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class AccountNotExistException extends UsernameNotFoundException {

    public AccountNotExistException() {
        super(AppUtil.getMessage("accountNotExistException"));
    }

    public AccountNotExistException(String msg) {
        super(msg);
    }
}
