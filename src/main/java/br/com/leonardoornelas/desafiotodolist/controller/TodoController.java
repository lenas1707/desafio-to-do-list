package br.com.leonardoornelas.desafiotodolist.controller;


import br.com.leonardoornelas.desafiotodolist.entities.Todo;
import br.com.leonardoornelas.desafiotodolist.service.TodoServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todos")
public class TodoController {


    private TodoServices todoServices;

    public TodoController(TodoServices todoServices) {
        this.todoServices = todoServices;
    }


    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo){
        return todoServices.create(todo);
    }


    @GetMapping
    List<Todo> list(){
        return todoServices.list();
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoServices.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id){
        return todoServices.delete(id);
    }
}
