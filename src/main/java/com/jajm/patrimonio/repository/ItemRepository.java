package com.jajm.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jajm.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
