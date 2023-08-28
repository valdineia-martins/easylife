package com.easylife.easyapi.repository;

import com.easylife.easyapi.entity.EspacoComum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacoComumRepository extends JpaRepository<EspacoComum, Long> {
}
