package me.rbarbieru.epicrapedia.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationEventPublisher
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@Configuration
@EnableWebSecurity
class DefaultSecurityConfig {

    @Bean
    @ConditionalOnMissingBean
    fun inMemoryUserDetailsManager(): InMemoryUserDetailsManager {
        return InMemoryUserDetailsManager(User.withUsername("username").password("{noop}password").build())
    }

    @Bean
    @ConditionalOnMissingBean(AuthenticationEventPublisher::class)
    fun defaultAuthenticationEventPublisher(delegate: ApplicationEventPublisher): DefaultAuthenticationEventPublisher {
        return DefaultAuthenticationEventPublisher(delegate)
    }
}