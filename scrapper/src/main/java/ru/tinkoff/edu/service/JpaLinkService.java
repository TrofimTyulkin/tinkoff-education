package ru.tinkoff.edu.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tinkoff.edu.entity.Links;
import ru.tinkoff.edu.repository.LinkRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JpaLinkService {

    LinkRepository repository;

    @Transactional
    public Links save(Links link) {
        return repository.save(link);
    }

    @Transactional(readOnly = true)
    public List<Links> getAll() {
        return repository.findAll();
    }



}
