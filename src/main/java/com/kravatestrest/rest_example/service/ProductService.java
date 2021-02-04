package com.kravatestrest.rest_example.service;
import com.kravatestrest.rest_example.model.Product;

import java.util.List;

public interface ProductService {

    /**
     * Созает новый продукт
     *
     * @param product продукт для создания
     */
    void create(Product product);

    /**
     * Возвращает список всех продуктов
     *
     * @return список продуктов
     */
    List<Product> readAll();

    /**
     * возвращает продук по его ID
     *
     * @param id - ID продукта
     * @return - обьект продукта с заданным ID
     */
    Product read(Long id);

    /**
     * Обновляет продукт с заданным ID,
     * в соответствии с переданным продуктом
     *
     * @param product - продукт в соответствии с которым нужно обновить данные
     * @param id      - id продукта которого нужно обновить
     * @return - true если данные были обновленны, иначе false
     */
    boolean update(Product product, Long id);

    /**
     * Удаление продукта с заданным ID
     *
     * @param id - id продукта, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
     boolean delete(Long id);
}
