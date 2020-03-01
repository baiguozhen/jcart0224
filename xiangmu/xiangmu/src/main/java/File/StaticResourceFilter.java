package File;

import constent.ClientExceptionConstant;
import exception.ClientException;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@Order(1)
@Component
public class StaticResourceFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${static.resource.extensions}")
    private Set<String> extensions;


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain)throws IOException, ServletException{
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        final String method=request.getMethod();
        final String requestURI=request.getRequestURI();

        final String[] strings=requestURI.split("\\.");
        String ext=strings[strings.length - 1];
        ext=ext.toLowerCase();
        if(extensions.contains(ext)){
            throw new ClientException(
                    ClientExceptionConstant.NOT_SUPPORT
            )
        }
    }



    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
