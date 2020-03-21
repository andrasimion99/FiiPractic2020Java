package fii.practic.yonder.demo.service;

public interface TestService {
    String getTestMessage();

    String getAll();

    void save(String name);

    void update(Integer id, String newName);

    void delete(Integer id);
}
