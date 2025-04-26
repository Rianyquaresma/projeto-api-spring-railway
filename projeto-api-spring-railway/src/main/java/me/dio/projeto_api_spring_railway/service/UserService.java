package me.dio.projeto_api_spring_railway.service;

import me.dio.projeto_api_spring_railway.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}