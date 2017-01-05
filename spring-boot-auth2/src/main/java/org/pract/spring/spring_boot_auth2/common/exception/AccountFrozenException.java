package org.pract.spring.spring_boot_auth2.common.exception;

import org.pract.spring.spring_boot_auth2.util.AppUtil;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class AccountFrozenException extends UsernameNotFoundException {

    public AccountFrozenException() {
        super(AppUtil.getMessage("accountFrozenException"));
    }

    public AccountFrozenException(String msg) {
        super(msg);
    }
}
