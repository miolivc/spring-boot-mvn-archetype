#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.List;

public interface Service<T> {
    List<T> getAll();
    void save(T t);
}
