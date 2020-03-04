package filter;

import constant.ClientExceptionConstant;
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
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Filter;

@Order(1)
@Component
public class StaticResourceFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) 
            throws IOException, ServletException, ClientException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        final String method = request.getMethod();
        final String requestURI = request.getRequestURI();
        logger.info("method request uri: {} {}", method, requestURI);

        final String[] strings = requestURI.split("\\.");
        String ext = strings[strings.length - 1];
        ext = ext.toLowerCase();
        Collection<Object> extensions = null;
        if (extensions.contains(ext)){
            throw new ClientException(ClientExceptionConstant.NOT_SUPPORT_STATIC_RESOURCE_ERRCODE,ClientExceptionConstant.NOT_SUPPORT_STATIC_RESOURCE_ERRMSG);
        }else {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
    }
}
