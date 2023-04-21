package com.whatDoing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatDoing.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
