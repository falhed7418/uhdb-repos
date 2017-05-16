/**
 * Copyright (c) 2017 realsnake1975@gmail.com
 *
 * 2017. 4. 14.
 */
package com.realsnake.sample.service.user.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.User;

/**
 * <pre>
 * Class Name : LoginSuccessEventListener.java
 * Description : Description
 *
 * Modification Information
 *
 * Mod Date         Modifier    Description
 * -----------      --------    ---------------------------
 * 2017. 4. 14.     전강욱      Generation
 * </pre>
 *
 * @author 전강욱
 * @since 2017. 4. 14.
 * @version 1.0
 */
// @Service
@Deprecated
public class LoginSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     */
    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        User user = (User) event.getAuthentication().getPrincipal();
        logger.debug("<<로그인 성공>> 아이디: {}", user.getUsername());
    }

}
