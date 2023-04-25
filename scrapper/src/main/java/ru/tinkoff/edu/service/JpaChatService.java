package ru.tinkoff.edu.service;

import org.springframework.transaction.annotation.Transactional;
import ru.tinkoff.edu.entity.Chat;
import ru.tinkoff.edu.repository.ChatRepository;

import java.util.List;

public class JpaChatService {
    ChatRepository repository;

    @Transactional
    public Chat createChat(long id) {
        Chat chat = new Chat();
        return repository.save(chat);
    }

    @Transactional
    public void deletePlayer(Long id) {
        Chat chat = new Chat();
        chat.setId(id);
        repository.delete(chat);
    }

    @Transactional(readOnly = true)
    public List<Chat> getAll() {
        return repository.findAll();
    }
}
