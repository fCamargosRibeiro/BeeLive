package com.beelive.beelive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beelive.beelive.domain.Hive;

@Repository
public interface HiveRepository extends JpaRepository<Hive, Long>{

}
