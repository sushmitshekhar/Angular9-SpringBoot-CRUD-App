package com.example.helloworld.todo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoElasticsearchRepository extends ElasticsearchRepository<Todo, Long> {
}
