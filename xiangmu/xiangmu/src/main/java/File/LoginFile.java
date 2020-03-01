package File;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import util.JWTUtil;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

@Order(2)
@Component
public class LoginFile implements Filter {
private Logger logger= (Logger) LoggerFactory.getLogger(this.getClass());
    @Autowired
    private JWTUtil jwtUtil;

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
