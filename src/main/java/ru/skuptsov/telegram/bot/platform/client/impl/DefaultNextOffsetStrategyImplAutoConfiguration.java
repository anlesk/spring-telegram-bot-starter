package ru.skuptsov.telegram.bot.platform.client.impl;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skuptsov.telegram.bot.platform.client.NextOffsetStrategy;

/**
 * @author Sergey Kuptsov
 * @since 25/08/2016
 */
@Configuration
@ConditionalOnMissingBean(NextOffsetStrategy.class)
public class DefaultNextOffsetStrategyImplAutoConfiguration {

    @Bean
    public NextOffsetStrategy defaultNextOffsetStrategy() {
        return new InMemoryNextOffsetStrategyImpl();
    }
}
