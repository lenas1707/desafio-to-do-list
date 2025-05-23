package br.com.leonardoornelas.desafiotodolist.repository;

import br.com.leonardoornelas.desafiotodolist.entities.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
