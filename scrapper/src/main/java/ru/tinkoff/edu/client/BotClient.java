package ru.tinkoff.edu.client;

import org.springframework.web.reactive.function.client.WebClient;
import ru.tinkoff.edu.dto.GitHubResponse;

public class BotClient {
    private final WebClient webClient;

    //для использования baseUrl по умолчанию (берётся из properties)
    public BotClient() {
        String gitHubBaseUrl = "http://localhost:8081";
        this.webClient = WebClient.create(gitHubBaseUrl);
    }


    //можно указать базовый URL
    public BotClient(String baseUrl) {
        this.webClient = WebClient.create(baseUrl);
    }


    public GitHubResponse updateLink() {

        return webClient.post().uri("/update").retrieve()
                .bodyToMono(GitHubResponse.class).block();

    }
}
