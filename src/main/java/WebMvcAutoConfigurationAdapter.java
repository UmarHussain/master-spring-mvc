import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by bv on 9/6/2016.
 */
@Configuration
@Import(WebMvcAutoConfiguration.EnableWebMvcConfiguration.class)
@EnableConfigurationProperties({ WebMvcProperties.class,
        ResourceProperties.class })
public class WebMvcAutoConfigurationAdapter {

    @Value("${spring.view.prefix:}")
    private String prefix = "";
    @Value("${spring.view.suffix:}")
    private String suffix = "";
    @Bean
    @ConditionalOnMissingBean(InternalResourceViewResolver.class)
    public InternalResourceViewResolver defaultViewResolver() {
        InternalResourceViewResolver resolver = new
                InternalResourceViewResolver();
        resolver.setPrefix(this.prefix);
        resolver.setSuffix(this.suffix);
        return resolver;
    }
}
