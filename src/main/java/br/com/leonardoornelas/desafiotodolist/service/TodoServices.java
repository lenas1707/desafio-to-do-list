package br.com.leonardoornelas.desafiotodolist.service;


import br.com.leonardoornelas.desafiotodolist.entities.Todo;
import br.com.leonardoornelas.desafiotodolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServices {

    private TodoRepository todoRepository;
    // injeção de dependencia

    public TodoServices(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();

    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending()
                .and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }

}
