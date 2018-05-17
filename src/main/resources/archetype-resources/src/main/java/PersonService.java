#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Qualifier("personService")
@org.springframework.stereotype.Service
public class PersonService implements Service<Person> {

    @Autowired
    private PersonRepository repository;

    @PostConstruct
    public void init() {
        repository.save(new Person("michelleolivcosta@gmail.com", "Michelle Oliveira"));
        repository.save(new Person("marialima@gmail.com", "Maria Lima"));
    }

    @Override
    public List<Person> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void save(Person person) {
        repository.save(person);
    }

}
